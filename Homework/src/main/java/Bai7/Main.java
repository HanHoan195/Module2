package Bai7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TeacherManager teacherManager = new TeacherManager();

        int choice;
        do {
            System.out.println("-----Menu-----");
            System.out.println("1. Xem danh sách.");
            System.out.println("2. Thêm GV.");
            System.out.println("3. Xóa GV");
            System.out.println("0. Exit");
            System.out.println("Nhập mục bạn chon:");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    teacherManager.showTeacher();
                    break;
                case 2:
                    teacherManager.addTeacher();
                    break;
                case 3:
                    teacherManager.deleteTeacher();
                    break;
                case 0:

                default:
                    System.out.println("Không đúng vui lòng nhập lại");
            }
        } while (choice != 0);
    }


}
