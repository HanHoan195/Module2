package baitap;

import java.util.HashMap;
import java.util.Iterator;

public class Q16 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1,"Hoàn");
        hashMap.put(2,"Pháp");
        hashMap.put(3,"Nghĩa");
        hashMap.put(4,"Hưng");

        Iterator<Integer> integerIterator = hashMap.keySet().iterator();
        while (integerIterator.hasNext()){
            int key = integerIterator.next();
            System.out.println("ID: "+ key + " Name : " + hashMap.get(key));
        }

//        for (int i = 0; i < hashMap.size(); i++) {
//            System.out.println(hashMap.get(i));
//        }

    }
}
