package lru;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 基于 LinkedHashMap 实现
 * @param <K>
 * @param <V>
 */
public class LruCache1<K,V> extends LinkedHashMap<K,V> {
    private final int capacity;

    public LruCache1(int capacity) {
        super(capacity,0.75f,true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }
}
