package baitap;

import java.util.ArrayList;
import java.util.LinkedList;

public class Q22 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList= new LinkedList<Integer>();
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(5);
        linkedList.add(7);
        System.out.println(linkedList);
        System.out.println();
        ArrayList<Integer> arrayList = new ArrayList<>(linkedList);
        for (Integer item : arrayList) {
            System.out.println(item);
        }
    }



}
