package baitap;

import java.util.*;

public class Q17 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(8,"Tám");
        hashMap.put(5,"Năm");
        hashMap.put(1,"Một");
//        hashMap.put(1,"Hai");
        hashMap.put(3,"Ba");

        //dùng collection
//        Set<Integer> keySet = hashMap.keySet();
//        ArrayList<Integer> keyList = new ArrayList<>(keySet);
//        Collections.sort(keyList);
//        for (Integer key : keyList) {
//            System.out.println(key + ":" + hashMap.get(key));
//        }

        //dùng treemap
        TreeMap<Integer,String> treeMap = new TreeMap<>(hashMap);
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
