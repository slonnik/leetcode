package interview;

import java.util.Map;
import java.util.Objects;

public class BalancerKey {

    private String key;

    private BalancerKey(String key) {
        this.key = key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BalancerKey that = (BalancerKey) o;
        return Objects.equals(key, that.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key);
    }

    public static BalancerKey fromString(String key) {
        return new BalancerKey(key);
    }
}
