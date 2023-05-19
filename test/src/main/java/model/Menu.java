package model;

import java.util.Scanner;

public class Menu {
    StudentView studentView = new StudentView();

    public void view() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("---- CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN ----");
            System.out.println("1. Xem danh sách sinh viên");
            System.out.println("2. Thêm mới sinh viên");
            System.out.println("3. Cập nhật sinh viên");
            System.out.println("4. Xóa sinh viên");
            System.out.println("5. Sắp xếp theo điểm trung bình");
            System.out.println("6. Đọc từ file");
            System.out.println("7. Ghi vào file");
            System.out.println("8. Thoát");
            System.out.println("Chọn chức năng: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    studentView.showStudent();
                    break;
                case 2:
                    studentView.addStudent();
                    break;
                case 3:
                    studentView.updateStudent();
                    break;
                case 4:
                    studentView.removeStudent();
                    break;
                case 5:
                    studentView.sortAveragePointView();
                    break;
                case 6, 7:
                    break;
                case 8:
                    studentView.exit();
            }
        } while (choice != 8);
    }
}

