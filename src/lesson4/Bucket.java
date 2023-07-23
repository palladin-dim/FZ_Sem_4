package lesson4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Bucket<K, V> {

    private Map<K, V> entities;

    public Bucket() {
        entities = new HashMap<>();
    }

    public void put(K key, V value) {
        Entity<K, V> entity = new Entity<>(key, value);
        entities.put(key, value);
    }

    public V get(K key) {
        return entities.get(key);
    }

    public V remove(K key) {
        return entities.remove(key);
    }

    public void clear() {
        entities.clear();
    }

    public int size() {
        return entities.size();
    }

    public Set<K> keySet() {
        return entities.keySet();
    }
}
