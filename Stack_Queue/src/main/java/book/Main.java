package book;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookStore bookStore = new BookStore();
        boolean checkActionMenu = true;
        do {
            System.out.println("Menu quản lý sách: ");
            System.out.println("Nhấn 1. Xem danh sách");
            System.out.println("Nhấn 2. Thêm sách");
            System.out.println("Nhấn 3. Sửa sách");
            System.out.println("Nhấn 4. Xóa sách");
            System.out.println("Nhấn 5. Sắp xếp sách theo giá ");
            System.out.println("Nhấn 6. Sắp xếp sách theo tên ");
            System.out.println("Nhấn 7. Tìm kiếm sách theo tên");
            System.out.println("Nhấn 8. Tìm kiếm sách theo tên hoặc mô tả");
            System.out.println("Nhập mục bạn chọn:");
            int actionMenu = Integer.parseInt(scanner.nextLine());
            switch (actionMenu){
                case 1:
                    bookStore.showBook();
                    break;
                case 2:
                    bookStore.addBook();
                    break;
                case 3:
                    bookStore.editBook();
                    break;
                case 4:
                    bookStore.deleteBook();
                    break;
                case 5:
                    bookStore.sortByPrice();
                    break;
                case 6:
                    bookStore.sortByName();
                    break;
                case 7:
                    bookStore.searchByName();
                    break;
                case 8:
                    bookStore.searchByNameOrDecription();
                    break;
                default:
                    System.out.println("Nhập thông tin sai vui lòng nhập lại:");
            }
            boolean checkActionMenuContinue = true;
            do {
                System.out.println("Bạn muốn tiếp tục không? Y/N");
                String actionMenuContinue = scanner.nextLine();
                switch (actionMenuContinue){
                    case "Y":
                        checkActionMenu = true;
                        checkActionMenuContinue = false;
                        break;
                    case "N":
                        checkActionMenu = false;
                        checkActionMenuContinue = false;
                        break;
                    default:
                        checkActionMenuContinue = true;
                }

            } while (checkActionMenuContinue);
        }  while (checkActionMenu);
    }
}