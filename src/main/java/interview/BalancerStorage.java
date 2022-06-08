package interview;

import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

public class BalancerStorage {

    private Map<BalancerKey, Service> items;

    public BalancerKey addService(String key, Service service) {
        if(key == null) {
            throw new IllegalArgumentException();
        }
        if(service == null) {
            throw new IllegalArgumentException();
        }

        var lock = new ReentrantLock();
        try {
            lock.lock();
            var balancerKey = BalancerKey.fromString(key);
            items.put(balancerKey, service);
            return balancerKey;
        } finally {
            lock.unlock();
        }
    }
}
