package org.example.reactive;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.core.scheduler.Schedulers;

public class SimpleTest {

    @Test
    void testMe() {
        Flux<String> data =
                Flux.just(" test1", " test2")
                    .subscribeOn(Schedulers.newParallel("new thread"))
                    .map(value -> Thread.currentThread().getName() + value);

        data.subscribe(value -> System.out.println(value));

    }
}
