
package communicator.async;

import communicator.common.runtime.GenDriverException;
import communicator.common.runtime.GenDriverModbusException;
import communicator.common.runtime.GenDriverSocketException;
import communicator.impl.SGrModbusDevice;
import communicator.restapi.exception.RestApiAuthenticationException;
import communicator.restapi.exception.RestApiResponseParseException;
import communicator.restapi.exception.RestApiServiceCallException;
import communicator.restapi.impl.SGrRestApiDevice;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.schedulers.Schedulers;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.stubbing.Answer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.time.Instant;
import java.util.concurrent.Callable;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class RxJavaDataStructureTest {

    private static final Logger LOG = LoggerFactory.getLogger(RxJavaDataStructureTest.class);
    @Mock
    SGrModbusDevice wagoModbusDevice;
    @Mock
    SGrRestApiDevice clemapRestApiDevice;

    private void initStubs() throws Exception {
        when(wagoModbusDevice.getVal(any(), any())).thenAnswer(
                (Answer<String>) invocation -> withDelay(500, "220V"));

        when(clemapRestApiDevice.getVal(any(), any())).thenAnswer(
                (Answer<String>) invocation -> withDelay(750, "20kWh"));
    }

    public interface ReadFunction<R> {
        R apply(String functionalProfile, String dataPoint) throws
                GenDriverException, GenDriverModbusException, GenDriverSocketException, IOException,
                RestApiServiceCallException, RestApiAuthenticationException, RestApiResponseParseException;
    }


    public static class SGrDeviceResult<T> {
        public String profileName;
        public String datapointName;
        public Throwable throwable;
        public T value;
        public Instant requestTime;
        public Instant responseTime;

        ExecStatus execStatus;

        @Override
        public String toString() {
            return String.format("%s - %s = %s : status=%s - error=%s, requestTime=%s, responseTime=%s",
                    profileName, datapointName, value, execStatus.name(), throwable, requestTime, responseTime);

        }
    }

    public static class SGrDeviceCallable<T> implements Callable<SGrDeviceResult<T>> {
        private final ReadFunction<T> readFunction;
        private final String profileName;
        private final String datapointName;

        public SGrDeviceCallable(ReadFunction<T> readFunction, String profileName, String datapointName) {
            this.readFunction = readFunction;
            this.profileName = profileName;
            this.datapointName = datapointName;
        }

        @Override
        public SGrDeviceResult<T> call() {

            SGrDeviceResult<T> result = new SGrDeviceResult<>();
            result.profileName = profileName;
            result.datapointName = datapointName;
            result.execStatus = ExecStatus.PROCESSING;
            try {
                result.requestTime = Instant.now();
                result.value = readFunction.apply(profileName, datapointName);
                result.execStatus = ExecStatus.SUCCESS;
                result.responseTime = Instant.now();
            } catch (Throwable t) {
                result.responseTime = Instant.now();
                result.execStatus = ExecStatus.ERROR;
                result.throwable = t;
            }
            return result;
        }
    }

    private String withDelay(long delay, String value) throws Exception {
        Thread.sleep(delay);
        LOG.debug("Delay {}ms is over.", delay);
        return value;
    }

    @Test
    void buildAndRunDataStructure() throws Exception {

        initStubs();

        Observable<SGrDeviceResult<String>> clemap_actPowerAC_tot =
                Observable.fromCallable(
                        new SGrDeviceCallable<>(clemapRestApiDevice::getVal, "ActivePowerAC", "ActivePowerACtot"))
                .subscribeOn(Schedulers.io());

        Observable<SGrDeviceResult<String>> wago_voltage_L1 =
                Observable.fromCallable(
                        new SGrDeviceCallable<>(wagoModbusDevice::getVal, "VoltageAC", "VoltageL1"));

        Observable<SGrDeviceResult<String>> wago_voltage_L2 =
                Observable.fromCallable(
                        new SGrDeviceCallable<>(wagoModbusDevice::getVal, "VoltageAC", "VoltageL1"));

        Observable<SGrDeviceResult<String>> wago_voltage_L3 =
                Observable.fromCallable(
                        new SGrDeviceCallable<>(wagoModbusDevice::getVal, "VoltageAC", "VoltageL1"));

        Observable<SGrDeviceResult<String>> wago_all =
                wago_voltage_L1.mergeWith(wago_voltage_L2).mergeWith(wago_voltage_L3)
                .subscribeOn(Schedulers.io());

        Disposable disposable = wago_all.mergeWith(clemap_actPowerAC_tot)
            .subscribe(this::onResult);

        Thread.sleep(2000);
        disposable.dispose();
    }

    private void onResult(SGrDeviceResult<?> results) {
        LOG.info("Received {}", results);
    }
}
