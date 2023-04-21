package baitap;

import java.util.Comparator;

public class ComparatorById implements Comparator<Student_Q18> {
    @Override
    public int compare(Student_Q18 o1, Student_Q18 o2) {
        if (o1.getId() > o2.getId()) {
            return 1;
        } else if (o1.getId() < o2.getId()) {
            return -1;
        } else {
            return 0;
        }
    }
}
