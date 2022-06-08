package interview;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class LoadBalancerTest {

    BalancerStorage balancerStorage;

    @Captor
    ArgumentCaptor<BalancerKey> keyCaptor;

    @BeforeEach
    void init() {
        balancerStorage = mock(BalancerStorage.class);
    }

    @Test
    void testWhenBalancerThrowsException() {
        when(balancerStorage.addService(any(String.class), any(Service.class)))
                .thenThrow(IllegalArgumentException.class);

        assertThrows(IllegalArgumentException.class,
                () -> new LoadBalancer(balancerStorage).register("test", new Service()));

    }

    @Test
    void testWhenLoadBalancerRegisterItem() {
        when(balancerStorage.addService(any(String.class), any(Service.class)))
                .thenAnswer(invocation -> BalancerKey.fromString(invocation.getArgument(0)));
        var result = new LoadBalancer(balancerStorage).register("test", new Service());
        assertEquals(BalancerKey.fromString("test"), result);
    }
}
