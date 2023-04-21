package baitap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q8 {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(5);
        number.add(2);
        number.add(3);

        List<ArrayList<Integer>> list = Arrays.asList(number);
        System.out.println(list);
        System.out.println(Arrays.toString(new ArrayList[]{number}));
    }
}
