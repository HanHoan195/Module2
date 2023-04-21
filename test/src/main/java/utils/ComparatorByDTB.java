package utils;

import Model.Student;

import java.util.Comparator;

public class ComparatorByDTB implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return (int) (o1.getDiemtrungbinh() - o2.getDiemtrungbinh());
    }
}
