package lesson4;

public class Entity<K, V> {

    public K key;
    public V value;

    public Entity(K key, V value) {
        this.key = key;
        this.value = value;
    }
}
