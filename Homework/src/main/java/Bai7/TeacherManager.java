package Bai7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class TeacherManager {
    List<Teacher> teachers;
    private Scanner scanner = new Scanner(System.in);
    public TeacherManager(){
        teachers = new ArrayList<>();
        teachers.add(new Teacher(1,"hoan",20,"an hoa"));
        teachers.add(new Teacher(2,"phap",23,"chùa thiên mụ"));
        teachers.add(new Teacher(3,"nghia",24,"bến thượng hải"));
    }

    public void showTeacher(){
        System.out.printf("%-3s | %-10s | %-5s | %-30s\n","ID" ,"Name", "Age","Hometown" );
        for (int i=0;i< teachers.size();i++){
            Teacher teacher = teachers.get(i);
            System.out.printf("%-3s | %-10s | %-5s | %-30s\n",
                    teacher.getId(),teacher.getName(),teacher.getAge(),teacher.getHometown());
        }
    }

    public void showTeacher(List<Teacher> teachers){
        System.out.printf("%-3s | %-10s | %-5s | %-30s\n","ID" ,"Name", "Age","Hometown" );
        for (int i=0;i< teachers.size();i++){
            Teacher teacher = teachers.get(i);
            System.out.printf("%-3s | %-10s | %-5s | %-30s\n",
                    teacher.getId(),teacher.getName(),teacher.getAge(),teacher.getHometown());
        }
    }

    public void addTeacher(){
        System.out.println("Nhập tên GV:");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi:");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập nơi ở:");
        String addrees = scanner.nextLine();

        Comparator comparator = new ComparatorById();
        teachers.sort(comparator);
        long maxId = teachers.get(teachers.size()-1).getId();

        Teacher teacher = new Teacher();
        teacher.setId((int) (maxId +1));
        teacher.setName(name);
        teacher.setAge(age);
        teacher.setHometown(addrees);

        teachers.add(teacher);
        showTeacher();
    }

    public void deleteTeacher(){
        System.out.println("Nhập id bạn muốn xóa:");
        long id = Long.parseLong(scanner.nextLine());
        for (int i=0;i<teachers.size();i++){
            if(id == teachers.get(i).getId()){
                teachers.remove(i);
            }
        }
        showTeacher();
    }


}
