package baitap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Q24 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();

        arr.add("A");
        arr.add("B");
        arr.add("C");
        arr.add("D");

       // Collections.reverse(arr);
        System.out.println(arr);

        String[] mang = new String[arr.size()];
        arr.toArray(mang);
        for (int i=0;i< mang.length/2;i++){
            String temp = mang[i];
            mang[i] = mang[(mang.length-1-i)];
            mang[(mang.length-1-i)] = temp;

        }
        System.out.println(Arrays.toString(mang));
    }
}
