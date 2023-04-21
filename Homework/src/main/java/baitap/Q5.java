package baitap;

import java.util.HashSet;

public class Q5 {
    public static void main(String[] args) {
        HashSet<Integer> number = new HashSet<Integer>();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        if (number.contains(5)){
            System.out.println("5 có trong mảng");
        } else {
            System.out.println("5 không có trong mảng");
        }
    }

}
