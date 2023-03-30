package Bai7;

import java.util.Comparator;

public class ComparatorById implements Comparator<Teacher> {
    @Override
    public int compare(Teacher o1, Teacher o2) {
        if (o1.getId()>o2.getId()){
            return 1;
        } else if (o1.getId()<o2.getId()) {
            return -1;
        } else {
            return 0;
        }
    }
}
