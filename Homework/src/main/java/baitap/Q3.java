package baitap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Q3 {
    public static void main(String[] args) {
       HashSet<Integer> number = new HashSet<Integer>();
       number.add(1);
       number.add(2);
       number.add(3);
       number.add(4);
       number.add(5);
        Iterator<Integer>   integerIterator = number.iterator();
        while (integerIterator.hasNext()){
            System.out.println(integerIterator.next());
        }
    }
}
