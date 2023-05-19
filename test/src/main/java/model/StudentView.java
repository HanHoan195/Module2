package model;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class StudentView {
    Scanner scanner = new Scanner(System.in);
    StudentSerVice studentSerVice = new StudentSerVice();
    public void addStudent() {
        System.out.println("Nhập ID:");
       long id = Long.parseLong(scanner.nextLine());
        System.out.println("Nhập tên:");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi:");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập giới tính:");
        String gender = scanner.nextLine();
        System.out.println("Nhập địa chỉ:");
        String address = scanner.nextLine();
        System.out.println("Nhập điểm trung bình:");
        double averagePoint = Double.parseDouble(scanner.nextLine());
        Student student = new Student(id,name,age,gender,address,averagePoint);
        studentSerVice.addStudent(student);
    }

    public void removeStudent() {
        System.out.println("Nhập id bạn muốn xóa:");
        long id = Long.parseLong(scanner.nextLine());
        studentSerVice.deleteStudent(id);

    }

    public void updateStudent() {
        System.out.println("Nhập Id bạn muốn sửa:");
        long id = Long.parseLong(scanner.nextLine());
        System.out.println("Nhập tên:");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi:");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập giới tính:");
        String gender = scanner.nextLine();
        System.out.println("Nhập địa chỉ:");
        String address = scanner.nextLine();
        System.out.println("Nhập điểm trung bình:");
        double averagePoint = Double.parseDouble(scanner.nextLine());

        Student student = new Student();
        student.setName(name);
        student.setAge(age);
        student.setGender(gender);
        student.setAddress(address);
        student.setAveragePoint(averagePoint);

        studentSerVice.updateStudent(id,student);
    }

    public void showStudent() {
        List<Student> studentList = studentSerVice.getAll();
        System.out.println("Danh sách sinh viên");
        System.out.printf("%-18s %-25s %-10s %-15s %-20s %-12s\n", "Mã SV", "Tên Sinh Viên", "Tuổi", "Giới tính", "Địa chỉ", "ĐTB");
        for (Student student : studentList) {
            System.out.printf("%-18s %-25s %-10s %-15s %-20s %-12s\n",
                    student.getId(),
                    student.getName(),
                    student.getAge(),
                    student.getGender(),
                    student.getAddress(),
                    student.getAveragePoint());
        }
    }
    public void showStudent(List<Student> students) {
        System.out.println("Danh sách sinh viên");
        System.out.printf("%-18s %-25s %-10s %-15s %-20s %-12s\n", "Mã SV", "Tên Sinh Viên", "Tuổi", "Giới tính", "Địa chỉ", "ĐTB");
        for (Student student : students) {
            System.out.printf("%-18s %-25s %-10s %-15s %-20s %-12s\n",
                    student.getId(),
                    student.getName(),
                    student.getAge(),
                    student.getGender(),
                    student.getAddress(),
                    student.getAveragePoint());

        }
    }


    public static void exit() {
        System.out.println("TẠM BIỆT");
        System.exit(3);
    }

    public void sortAveragePointView() {
    List<Student> studentList = studentSerVice.getAll();
        Comparator comparator = new ComparatorByAVGP();
        studentList.sort(comparator);
        showStudent(studentList);
    }



    public static void main(String[] args) {
        StudentView studentView = new StudentView();
        studentView.removeStudent();
    }

}
