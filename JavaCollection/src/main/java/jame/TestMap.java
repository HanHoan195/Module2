package jame;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Smith", 30);
        hashMap.put("Pháp", 26);
        hashMap.put("Hoàn", 28);
        hashMap.put("Nghĩa", 30);
        hashMap.put("BẰng", 29);
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n");

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f,true);
        linkedHashMap.put("Hoàn", 30);
        linkedHashMap.put("Nghĩa", 31);
        linkedHashMap.put("Pháp", 28);
        linkedHashMap.put("Bằng", 30);
        System.out.println("\nThe age for " + "Hoàn is " + linkedHashMap.get("Hoàn"));//get lấy ra giá trị dựa trên key
    }
}
