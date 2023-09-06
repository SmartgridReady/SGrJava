
package communicator.async;

import communicator.async.callable.AsyncResult;
import communicator.async.callable.DeviceReadCallable;
import communicator.common.api.Float32Value;
import communicator.common.api.Value;
import communicator.modbus.impl.SGrModbusDevice;
import communicator.rest.impl.SGrRestApiDevice;
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
                (Answer<Value>) invocation -> withDelay(500, Float32Value.of(220f)));

        when(clemapRestApiDevice.getVal(any(), any())).thenAnswer(
                (Answer<String>) invocation -> withDelay(750, "20kWh"));
    }

    private String withDelay(long delay, String value) throws Exception {
        Thread.sleep(delay);
        LOG.debug("Delay {}ms is over.", delay);
        return value;
    }

    private Value withDelay(long delay, Value value) throws Exception {
        Thread.sleep(delay);
        LOG.debug("Delay {}ms is over.", delay);
        return value;
    }

    @Test
    void buildAndRunDataStructure() throws Exception {

        // FIXME allow RESTAPI / Clemap to return 'Value'
        // initStubs();

        Observable<AsyncResult<String>> clemap_actPowerAC_tot =
                Observable.fromCallable(
                        new DeviceReadCallable<>(clemapRestApiDevice::getVal, "ActivePowerAC", "ActivePowerACtot"))
                .subscribeOn(Schedulers.io());

        Observable<AsyncResult<Value>> wago_voltage_L1 =
                Observable.fromCallable(
                        new DeviceReadCallable<>(wagoModbusDevice::getVal, "VoltageAC", "VoltageL1"));

        Observable<AsyncResult<Value>> wago_voltage_L2 =
                Observable.fromCallable(
                        new DeviceReadCallable<>(wagoModbusDevice::getVal, "VoltageAC", "VoltageL2"));

        Observable<AsyncResult<Value>> wago_voltage_L3 =
                Observable.fromCallable(
                        new DeviceReadCallable<>(wagoModbusDevice::getVal, "VoltageAC", "VoltageL3"));

        Observable<AsyncResult<Value>> wago_all =
                wago_voltage_L1.mergeWith(wago_voltage_L2).mergeWith(wago_voltage_L3)
                .subscribeOn(Schedulers.io());

        // FIXME allow RESTAPI / Clemap to return 'Value'
        // Disposable disposable = wago_all.mergeWith(clemap_actPowerAC_tot)
        //  .subscribe(this::onResult);

        // Thread.sleep(2000);
        // disposable.dispose();
    }

    private void onResult(AsyncResult<?> results) {
        LOG.info("Received {}", results);
    }
}
