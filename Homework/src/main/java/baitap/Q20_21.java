package baitap;

import java.util.ArrayList;

public class Q20_21 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(6);
        arrayList.add(32);

        arrayList.add(0,10);
        arrayList.add(arrayList.size() , 4 );

        arrayList.remove(0);
        arrayList.remove(4);


        System.out.println(arrayList);
    }
}
