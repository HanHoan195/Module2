package baitap;

import java.util.ArrayList;

public class Q2 {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("Pháp");
        name.add("Hoàn");
        name.add("Nghĩa");

        String[] ten = new String[name.size()];

        name.toArray(ten);
        for (int i=0;i< ten.length;i++){
            System.out.println(ten[i]);
        }
    }

}
