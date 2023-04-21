package baitap;

import java.util.ArrayList;

public class ArrayListLoopExample {
    public static void main(String args[]) {
        // initialize ArrayList
        ArrayList<Integer> al = new ArrayList<Integer>();
        // add elements to ArrayList object
        al.add(3);
        al.add(17);
        al.add(6);
        al.add(9);
        al.add(7);
        System.out.println("Using Advanced For Loop");
        for (int i=0;i< al.size();i++){
            System.out.println(al.get(i));
        }
//        for (Integer num : al) {
//            System.out.println(num);
//        }
    }
}
