package communicator.async;

import communicator.modbus.impl.SGrModbusDevice;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.schedulers.IoScheduler;
import io.reactivex.rxjava3.internal.schedulers.RxThreadFactory;
import io.reactivex.rxjava3.internal.schedulers.SingleScheduler;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.stubbing.Answer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.Mockito.when;

@ExtendWith(value = MockitoExtension.class)
public class RxPrioritySchedulerTest {

    private static final Logger LOG = LoggerFactory.getLogger(RxPrioritySchedulerTest.class);

    @Mock
    SGrModbusDevice wagoModbusDevice;

    private String withDelay(long delay, String value) throws Exception {
        Thread.sleep(delay);
        LOG.info("Delay {}ms, val={} is over.", delay, value);
        return value;
    }

    @Test
    void priorityScheduler() throws Exception {

        Scheduler schedulerMaxPrio = new IoScheduler(new RxThreadFactory("MAX_PRIO_SCHEDULER", Thread.MAX_PRIORITY));
        Scheduler schedulerMinPrio = new IoScheduler(new RxThreadFactory("MIN_PRIO_SCHEDULER", Thread.MIN_PRIORITY));
        Scheduler observingThread = new SingleScheduler();

        when(wagoModbusDevice.getVal("VoltageAC", "VoltageL1")).thenAnswer(
                (Answer<String>) invocation -> withDelay(500, "220V"));

        when(wagoModbusDevice.getVal("VoltageAC", "VoltageL2")).thenAnswer(
                (Answer<String>) invocation -> withDelay(500, "180V"));

        // Priority scheduler
        Observable<String> voltage1 = Observable.fromCallable(
                        () -> wagoModbusDevice.getVal("VoltageAC", "VoltageL1"))
                .subscribeOn(schedulerMinPrio);

        for (int i=1; i <20; i++) {
                voltage1 = voltage1.mergeWith(
                        Observable.fromCallable(
                            () -> wagoModbusDevice.getVal("VoltageAC", "VoltageL1"))
                            .subscribeOn(schedulerMinPrio)).observeOn(observingThread);
        }

        Disposable dispose1 = voltage1.subscribe(this::assertVoltage);

        Disposable dispose2 = Observable.just(wagoModbusDevice.getVal("VoltageAC", "VoltageL2"))
                .subscribeOn(schedulerMaxPrio).observeOn(observingThread)
                .subscribe(this::assertVoltage, this::failOnError);

        Thread.sleep(1000);

        dispose1.dispose();
        dispose2.dispose();
    }

    private void assertVoltage(String voltage) {
        LOG.info("Received Voltage {}", voltage);
        assertTrue(voltage.equals("220V") || voltage.equals("180V"));
    }

    private void failOnError(Throwable t) {
        fail("Unexpected Exception: " + t.getMessage());
    }

}
