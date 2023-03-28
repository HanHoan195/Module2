package excercise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomerManager customerManager = new CustomerManager();
        boolean checkMenu = true;

        do {
            System.out.println("Menu quản lý customer: ");
            System.out.println("Nhấn 1. Xem danh sách");
            System.out.println("Nhấn 2. Thêm khách hàng ");
            System.out.println("Nhấn 3. Sửa khách hàng");
            System.out.println("Nhấn 4. Xóa khách hàng");
            System.out.println("Nhấn 5. Sắp xếp khách hàng theo tên ");
            System.out.println("Nhấn 6. Sắp xếp khách hàng theo ngày tạo");
            System.out.println("Nhấn 7. Tìm kiếm khách hàng theo tên");
            System.out.println("Nhấn 8. Tìm kiếm khách hàng theo email");
            System.out.print("Nhập mục bạn muốn chọn:");

            int actionMenu = Integer.parseInt(scanner.nextLine());
            switch (actionMenu){
                case 1:
                    customerManager.showList();
                    break;
                case 2:
                    customerManager.addCustomer();
                    break;
                case 3:
                    customerManager.editCustomer();
                    break;
                case 4:
                    customerManager.deleteCustomer();
                    break;
                case 5:
                    customerManager.sortByName();
                    break;
                case 6:
                    customerManager.sortByDate();
                    break;
                case 7:
                    customerManager.searchByName();
                    break;
                case 8:
                    customerManager.searchByEmail();

                default:
                    System.out.println("Nhập sai thông tin! Vui lòng nhập lại!");
            }
            boolean checkMenuContinue = true;
            do {
                System.out.println("Bạn có muốn tiếp tục không: Y/N");
                String actionMenuContinue = scanner.nextLine();
                switch (actionMenuContinue){
                    case "Y":
                        checkMenu = true;
                        checkMenuContinue = false;
                        break;
                    case "N":
                        checkMenu = false;
                        checkMenuContinue = false;
                        break;
                    default:
                        checkMenuContinue = true;
                }
            }while (checkMenuContinue);
        } while (checkMenu);

    }
}
