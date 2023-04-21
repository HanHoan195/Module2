package utils;

import Model.Student;

import java.util.Comparator;

public class ComparatorDTBDESC implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return (int) (o2.getDiemtrungbinh() - o1.getDiemtrungbinh());
    }
}
