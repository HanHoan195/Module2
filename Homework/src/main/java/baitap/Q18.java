package baitap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Q18 {
    public static void main(String[] args) {
            ArrayList<Student_Q18> arrayList = new ArrayList<Student_Q18>();
            arrayList.add(new Student_Q18(1,"Hoàn"));
            arrayList.add(new Student_Q18(8,"Pháp"));
            arrayList.add(new Student_Q18(3,"Nghĩa"));
            arrayList.add(new Student_Q18(9,"Hưng"));

//       Comparator comparator = new ComparatorById();
//       arrayList.sort(comparator);

        //Comperable
        Collections.sort(arrayList);

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }


    }
}
