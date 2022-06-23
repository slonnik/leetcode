package reactive;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;
import reactor.util.context.Context;

import java.time.Duration;
import java.util.concurrent.CountDownLatch;


public class RTest {

    @Test
    void test1() throws Exception {

        var countDownLatch = new CountDownLatch(10);

        var result = Mono.create(monoSink -> {
            monoSink.success("Ura " + Thread.currentThread().getName());
        }).repeat(5).delayElements(Duration.ofSeconds(1));

        for (int i = 0; i < 10; ++i) {
            result
                    .transformDeferredContextual((value, context) -> {
                        return value.map(item -> "[%d] %s : %s".formatted(context.get("id"), item, Thread.currentThread().getName()));
                    })
                    .subscribeOn(Schedulers.boundedElastic())
                    .subscribe(System.out::println, System.out::println, () -> {
                        countDownLatch.countDown();
                    }, Context.of("id", i));
        }

        countDownLatch.await();
    }
}
