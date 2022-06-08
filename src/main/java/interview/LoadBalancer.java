package interview;

import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

public class LoadBalancer {

   private final BalancerStorage balancerStorage;

   public LoadBalancer(BalancerStorage balancerStorage) {
       this.balancerStorage = balancerStorage;
   }

    public BalancerKey register(String key, Service item) {

       return balancerStorage.addService(key, item);

   }
}
