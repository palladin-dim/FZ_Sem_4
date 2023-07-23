package lesson4;

import java.util.ArrayList;
import java.util.List;

public class HashMap<K, V> {

    private static final int INIT_BUCKET_COUNT = 16;

    public List<Bucket<K, V>> buckets;

    public HashMap() {
        this(INIT_BUCKET_COUNT);
    }

    public HashMap(int bucketCount) {
        buckets = new ArrayList<>(bucketCount);
        for (int i = 0; i < bucketCount; i++) {
            buckets.add(new Bucket<>());
        }
    }

    public void put(K key, V value) {
        int bucketIndex = getBucketIndex(key);
        Bucket<K, V> bucket = buckets.get(bucketIndex);
        bucket.put(key, value);
    }

    public V get(K key) {
        int bucketIndex = getBucketIndex(key);
        Bucket<K, V> bucket = buckets.get(bucketIndex);
        return bucket.get(key);
    }

    public V remove(K key) {
        int bucketIndex = getBucketIndex(key);
        Bucket<K, V> bucket = buckets.get(bucketIndex);
        return bucket.remove(key);
    }

    public void clear() {
        for (Bucket<K, V> bucket : buckets) {
            bucket.clear();
        }
    }

    public int size() {
        int size = 0;
        for (Bucket<K, V> bucket : buckets) {
            size += bucket.size();
        }
        return size;
    }

    private int getBucketIndex(K key) {
        return Math.abs(key.hashCode()) % buckets.size();
    }
}
