package baitap;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class Q25 {
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap = new TreeMap<Integer,String>();
        treeMap.put(1,"A");
        treeMap.put(2,"B");
        treeMap.put(3,"C");
        treeMap.put(4,"D");

        Set<Integer> key= treeMap.keySet();
        for (Integer k : key) {
            System.out.println(k + "-" + treeMap.get(k));
        }
    }
}
