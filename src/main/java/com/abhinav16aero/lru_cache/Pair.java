package com.abhinav16aero.lru_cache;

public class Pair<K,V> {
    K key;
    V value;

    Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public static class LRUCacheTest {

        public static void main(String[] args) {

            LRUCache cache = new LRUCache(3);
            cache.put("Mercedes", 10);
            cache.put("Audi", 20);
            cache.put("BMW", 30);

            System.out.println(cache.front().key);
            cache.put("BMW", 30);
            System.out.println(cache.front().key);

            if(cache.get("Mercedes")== -1){
                System.out.println("Mercedes doesn't exist");
            }

        }

    }
}