package bai12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Manager manager = new Manager();//tạo đối tượng

        //lm menu
        boolean checkMenu = true;
        do {
            System.out.println("-----MENU-----");
            System.out.println("1. Xem danh sách phương tiện.");
            System.out.println("2. Thêm phương tiện.");
            System.out.println("3. Xóa phương tiện.");
            System.out.println("4. Tìm phương tiện theo hãng.");
            System.out.println("5. Tìm phương tiện theo màu.");
            System.out.println("Nhập mục bạn chon!");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                   manager.showRoadTransport();
                   break;
                case 2:
                    manager.addRoadTransport();
                    break;
                case 3:
                    manager.removeRoadTransport();
                    break;
                case 4:
                    manager.searchByManufacture();
                    break;
                case 5:
                    manager.searchByColor();
                    break;
                default:
                    System.out.println("Thông tin sai vui lòng nhập lại!");
            }

            boolean checkContinue = true;

            do {
                System.out.println("Bạn muốn tiếp tục không? Y/N");
                String choiceContinue = scanner.nextLine();
                switch (choiceContinue){
                    case "Y":
                        checkContinue = false;
                        checkMenu = true;
                        break;
                    case "N":
                        checkContinue = false;
                        checkMenu = false;
                }
            } while (checkContinue);

        } while (checkMenu);


    }



}
