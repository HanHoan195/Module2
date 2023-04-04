package comparabel_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getAge()>o2.getAge()){
            return 1;
        } else if (o1.getAge()< o2.getAge()) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Student student= new Student("Hoàn", 28,"An hòa");
        Student student1= new Student("Pháp", 20,"Chùa thiên mụ");
        Student student2= new Student("Nghĩa", 25,"Kim Long");
        Student student3= new Student("Bằng", 30,"Huế");

        List<Student> lists = new ArrayList<>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        Collections.sort(lists);

        for (Student st : lists){
            System.out.println(st.toString());
        }

        System.out.println(" ");
        System.out.println("COMPARATOR");
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists,ageComparator);
        for (Student st : lists){

            System.out.println(st.toString());
        }
    }
}
