package view;

import Model.Student;
import sevice.StudentSevice;
import utils.ComparatorByDTB;
import utils.ComparatorById;
import utils.ComparatorDTBDESC;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class StudentView {
    List<Student> students;
    Scanner scanner = new Scanner(System.in);
    StudentSevice studentSevice = new StudentSevice();
    public void showStudent(){
        students = studentSevice.getStudent();
        System.out.println("Danh sách sinh viên");
        System.out.println("");
        System.out.printf("%-5s %-30s %-10s %-10s %-20s %-15s\n",
                "Mã sinh viên", "Họ tên", "Tuổi", "Giới tính", "Địa chỉ", "Điểm trung bình");
        System.out.println("");
        for (Student student: students){
            System.out.printf("%-5s %-30s %-10s %-10s %-20s %-15s\n",
                    student.getId(),student.getName(),student.getAge(),student.getGender(),student.getAddress(),student.getDiemtrungbinh());

        }
        System.out.println();
    }

    public void addStudent(){

        System.out.println("Nhập họ và tên");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập giới tính");
        String gender = scanner.nextLine();
        System.out.println("Nhập địa chỉ");
        String address = scanner.nextLine();
        System.out.println("Nhập điểm trung bình");
        double diemtrungbinh = Double.parseDouble(scanner.nextLine());
        long maxId = students.get(students.size()-1).getId();

        Student student = new Student();
        student.setId((int) (maxId + 1));
        student.setName(name);
        student.setAge(age);
        student.setGender(gender);
        student.setAddress(address);
        student.setDiemtrungbinh(diemtrungbinh);

        students.add(student);
        System.out.println("Đã thêm thành công!");
        showStudent();
    }

    public void updateStudent(){
        System.out.println("Nhập ID bạn muốn sửa");
    }

    public void deleteStudent(){
        System.out.println("Nhập ID sinh viên muốn xóa:");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i< students.size();i++){
            if(id == students.get(i).getId()){
                students.remove(i);
            }
        }
        showStudent();
    }

    public void sortStudentByDTB(){
        List<Student> studentList =studentSevice.getStudent();
        studentList.sort(new ComparatorByDTB());
        System.out.println("Danh sách sinh viên");
        System.out.println("");
        System.out.printf("%-5s %-30s %-10s %-10s %-20s %-15s\n",
                "Mã sinh viên", "Họ tên", "Tuổi", "Giới tính", "Địa chỉ", "Điểm trung bình");
        System.out.println("");
        for (Student student: studentList){
            System.out.printf("%-5s %-30s %-10s %-10s %-20s %-15s\n",
                    student.getId(),student.getName(),student.getAge(),student.getGender(),student.getAddress(),student.getDiemtrungbinh());

        }
        System.out.println();

    }

    public void sorDTBDESC(){
        List<Student> studentList = studentSevice.getStudent();
        studentList.sort( new ComparatorDTBDESC());

        System.out.println("Danh sách sinh viên");
        System.out.println("");
        System.out.printf("%-5s %-30s %-10s %-10s %-20s %-15s\n",
                "Mã sinh viên", "Họ tên", "Tuổi", "Giới tính", "Địa chỉ", "Điểm trung bình");
        System.out.println("");
        for (Student student: studentList){
            System.out.printf("%-5s %-30s %-10s %-10s %-20s %-15s\n",
                    student.getId(),student.getName(),student.getAge(),student.getGender(),student.getAddress(),student.getDiemtrungbinh());
            System.out.println();
        }
    }

    public void Exit(){
        System.out.println("Xin cám ơn!");
    }

}
