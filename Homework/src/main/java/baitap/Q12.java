package baitap;

import java.util.ArrayList;

public class Q12 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        try {
            arrayList.add(Integer.valueOf("dsa"));
        } catch (NumberFormatException e){
            e.getStackTrace();
        }

        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        System.out.println(arrayList);
    }
}
