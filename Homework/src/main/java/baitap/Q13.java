package baitap;

import java.util.HashSet;

public class Q13 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("a");
        hashSet.add("b");
        hashSet.add("c");
        hashSet.add("d");

        for (String element : hashSet) {
            System.out.println(element);
        }
        System.out.println(hashSet);
    }
}
