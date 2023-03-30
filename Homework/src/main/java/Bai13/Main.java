package Bai13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Company company = new Company();
        boolean checkMune = true;
        do {
            System.out.println("---MENU---");
            System.out.println("1. Xem danh sách");
            System.out.println("2. Thêm Nhân viên");
            System.out.println("3. Xóa Nhân viên");
            System.out.println("4. Tìm nhân viên theo loại:");
            System.out.println("Nhập mục muốn chọn:");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    company.showEmployee();
                    break;
                case 2:
                    company.addEmployee();
                    break;
                case 3:
                    company.editEmployee();
                    break;
                case 4:
                    company.searchbyType();
                    break;
                default:
                    System.out.println("Sai thông tin vui lòng nhập lại!");
            }
            boolean checkContinue = true;
            do {
                System.out.println("Bạn muốn tiếp tục không? Y/N");
                String choiceContinue = scanner.nextLine();
                switch (choiceContinue){
                    case "Y":
                        checkContinue = false;
                        checkMune = true;
                        break;
                    case "N":
                        checkContinue = false;
                        checkMune = false;
                        break;
                    default:
                        checkContinue = false;
                }

            } while (checkContinue);
        } while (checkMune);


    }
}
