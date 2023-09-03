package lru;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(10,0.75f,true);
        linkedHashMap.put("1","1");
        linkedHashMap.put("2","1");
        linkedHashMap.put("3","1");
        linkedHashMap.put("4","1");
        linkedHashMap.put("5","1");
       // linkedHashMap.get("1");
        System.out.println(linkedHashMap.toString());
        linkedHashMap.put("6","1");
        System.out.println(linkedHashMap.toString());

       LruCache1<String,String> lruCache1 = new LruCache1<>(3);
       lruCache1.put("1","1");
        lruCache1.put("2","1");
        lruCache1.put("3","1");
        lruCache1.put("4","1");
        lruCache1.get("2");
        lruCache1.put("5","1");
        System.out.println(lruCache1);


    }
}
