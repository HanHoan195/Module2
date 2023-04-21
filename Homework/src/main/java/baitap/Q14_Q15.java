package baitap;

import java.util.HashMap;

public class Q14_Q15 {
    public static void main(String[] args) {
        HashMap<Integer, String> student = new HashMap<>();
        student.put(1,"Hoàn");
        student.put(2,"nghiĩa");
        student.put(3,"Nghĩa");
        student.put(4,"Đạt");

        System.out.println(student.size());
        System.out.println(student.isEmpty());
    }
}
