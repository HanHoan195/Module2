package baitap;

import java.lang.reflect.Array;
import java.util.HashSet;

public class Q23 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Hoàn");
        hashSet.add("Đạt");
        hashSet.add("Pháp");
        hashSet.add("Hưng");
        hashSet.add("Nghĩa");

        System.out.println("Hashset: " + hashSet);

        String[] arr = new String[hashSet.size()];
        hashSet.toArray(arr);

        System.out.println();
        System.out.println("Aray:");
        for (String item : arr ) {
            System.out.println(item);
        }

    }
}
