package com.abhinav16aero.lru_cache;

/* @author Abhinav Kumar
 */

public class Client {
    public static void main(String[] args) {
        CustomHashMap<String, Integer> hm = new CustomHashMap<>();
        hm.put("Firstcache", 1);
        hm.put("Secondcache", 2);
        hm.put("Thirdcache", 3);

        System.out.println(hm.size());
        System.out.println(hm.get("Secondcache"));
        System.out.println("Got Secondcache");
        hm.remove("Secondcache");
        System.out.println(hm.size());


    }
}