package baitap;

import java.util.ArrayList;
import java.util.Collections;

public class Q19 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(10);
        arrayList.add(5);
        arrayList.add(2);
        arrayList.add(6);

        Collections.sort(arrayList, Collections.reverseOrder());

        System.out.println(arrayList);
    }
}
