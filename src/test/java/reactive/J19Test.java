package reactive;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;

public class J19Test {

    @Test
    void testPositive1() throws Exception {
        var thread = Thread.ofVirtual().name("Test").start(() -> System.out.println("Thread: %s".formatted(Thread.currentThread().getName())));
        thread.join();
    }

    @Test
    void testPositive2() throws Exception {
        /*var result = Executors
                .newVirtualThreadPerTaskExecutor()
                .submit(() -> System.out.println("Thread: %s".formatted(Thread.currentThread().getName())));
        result.get();*/
        Callable<String> task = () -> "Thread: %s %s".formatted(Thread.currentThread().getName(), Thread.currentThread().isVirtual());
        Executors
                .newThreadPerTaskExecutor(Thread.ofVirtual().name("Test", 0).factory())
                .invokeAll(List.of(task, task))
                .stream()
                .map(future -> {
                    try{
                        return future.get();
                    }catch (Exception ex) {
                        return "";
                    }
                })
                .peek(System.out::println)
                .allMatch(__ -> true);


    }
}
