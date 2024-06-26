package com.abhinav16aero.lru_cache;

public class LRUCacheTest {

    public static void main(String[] args) {

        LRUCache cache = new LRUCache(3);

        cache.put("zero", 100);
        cache.put("one", 1);
        cache.put("two", 2);
        System.out.println(cache.get("one")); // returns 1

        cache.put("three", 3); // removes key "two"
        System.out.println(cache.get("two")); // returns -1 (not found)

        cache.put("four", 4); // removes key "one"
        System.out.println(cache.get("one")); // returns -1 (not found)
        System.out.println(cache.get("three")); // returns 3
        System.out.println(cache.get("four")); // returns 4

        if(cache.get("mango")== -1){
            System.out.println("doesn't exist");
        }

    }

}