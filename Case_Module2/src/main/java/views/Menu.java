package views;

import model.User;

import java.util.InputMismatchException;
import java.util.Scanner;

//import static sun.security.jgss.GSSUtil.login;

public class Menu {
    static ProductView productView = new ProductView();
    static PaymentView paymentView = new PaymentView();
    static Scanner scanner = new Scanner(System.in);
    private static User currentUser = null;
    private static boolean isFinished = false;

    public static boolean checkLogin() {
        if (currentUser == null) {
            System.out.println("Đăng nhập mới được dùng !");
            return false;
        }
        return true;
    }

    public static User login() {
        LoginView loginView = new LoginView();
        boolean isLoggedIn = false;
        User user = null;
        while (!isLoggedIn) {
            try {
                user = loginView.login();
                isLoggedIn = true;
                currentUser = user;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Có lỗi khi đăng nhập! Vui lòng thử lại!");
                return null;
            }
        }
        return user;
    }

    public static void admin() {
        boolean isLoggedIn = checkLogin();
        if (!isLoggedIn) {
            login();
            return;
        }
    }

    public static void manager() {
        boolean isLoggedIn = checkLogin();
        if (!isLoggedIn) {
            login();
//            return;
        }
        boolean isFinished = false;
        Scanner scanner1 = new Scanner(System.in);
        menuManager();
        while (!isFinished) {
            try {
                System.out.println("Chọn chức năng: ");
                System.out.print("\t︻┳═一 ");
//                System.out.println();
                int choice = scanner1.nextInt();
                switch (choice) {
                    case 1:
                        productView.showProductManager();
                        break;
                    case 2:
                        productView.showDescriptionManager();
                        break;
                    case 3:
                        productView.addProduct();
                        break;
                    case 4:
                        productView.updateProduct();
                        break;
                    case 5:
                        productView.findProductByNameManager();
                        break;
                    case 6:
                        productView.findProductByTypeManager();
                        break;
                    case 7:
                        paymentView.showRevenue();
                        break;
                    case 8:
                        action();
                        break;
                    case 9:
                        exit();
                        isFinished = true;
                        break;
                    default:
                        System.out.println("Chọn chức năng không đúng vui lòng nhập lại");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Nhập sai vui lòng nhập lại!");
                System.out.println();
            }

        }


    }

    public static void menuManager() {
        System.out.println("             ╔═════════════MANAGER═════════════════════════════════════╗");
        System.out.println("             ║           [1] Hiển thị danh sách sản phẩm               ║");
        System.out.println("             ║           [2] Hiển thị mô tả sản phẩm                   ║");
        System.out.println("             ║           [3] Thêm sản phẩm vào danh sách               ║");
        System.out.println("             ║           [4] Sửa thông tin sản phẩm                    ║");
        System.out.println("             ║           [5] Tìm kiếm sản phẩm theo tên                ║");
        System.out.println("             ║           [6] Tìm kiếm sản phẩm theo loại               ║");
        System.out.println("             ║           [7] Xem tổng doanh thu                        ║");
        System.out.println("             ║           [8] Quay lại                                  ║");
        System.out.println("             ║           [9] Thoát                                     ║");
        System.out.println("             ╚═════════════════════════════════════════════════════════╝");
        System.out.println();

    }

    public static void menuCustomer() {
        System.out.println("             ╔═════════════CUSTOMER══════════════════════════════════════════╗");
        System.out.println("             ║           ☏ WELCOME TO MOBILE ONLINE! ☏                      ║");
        System.out.println("             ║           [1] Hiển thị danh sách sản phẩm                     ║");
        System.out.println("             ║           [2] Hiển thị mô tả sản phẩm                         ║");
        System.out.println("             ║           [3] Tìm kiếm sản phẩm theo tên                      ║");
        System.out.println("             ║           [4] Tìm kiếm sản phẩm theo loại                     ║");
        System.out.println("             ║           [5] Sắp xếp sản phẩm theo giá tăng dần              ║");
        System.out.println("             ║           [6] Sắp xếp sản phẩm theo giá giảm dần              ║");
        System.out.println("             ║           [7] Đặt hàng                                        ║");
        System.out.println("             ║           [8] Quay lại                                        ║");
        System.out.println("             ║           [9] Thoát                                           ║");
        System.out.println("             ╚═══════════════════════════════════════════════════════════════╝");
        System.out.println();
    }

    public static void  action() {
        do {
            menuMain();
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("\nWHO ARE YOU??? ");
            System.out.print("\t︻┳═一 ");
//            System.out.println();
            int choice = -1;
            try {
                choice = Integer.parseInt(scanner1.nextLine());
            } catch (InputMismatchException io) {
                System.out.println("Nhập sai! Vui lòng nhập lại!");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
                switch (choice) {
                    case 1:
                        manager();
                        break;
                    case 2:
                        customer();
                        break;
                    case 3:
                        exit();
                        break;
                    default:
                        System.out.println("Chọn chức năng không đúng vui lòng chọn lại!");
                        action();
                        break;
                }

        } while (true);
    }

    public static void menuMain() {
        System.out.println();
        System.out.println("╔════WHO ARE YOU?═══════╗");
        System.out.println("║    [1] MANAGER        ║ ");
        System.out.println("║    [2] CUSTOMER       ║ ");
        System.out.println("║    [3] EXIT           ║ ");
        System.out.println("╚═══════════════════════╝");
        System.out.println();
    }

    public static void customer() {
        menuCustomer();
        int choice = -1;

        System.out.println("Bạn muốn làm chi:");
        System.out.print("\t︻┳═一 ");
//        System.out.println();
        try {
            choice = Integer.parseInt(scanner.nextLine());

        switch (choice) {
            case 1:
                productView.showProductGuest();
                break;
            case 2:
                productView.showDescriptionGuest();
                break;
            case 3:
                productView.findProductByNameGuest();
                break;
            case 4:
                productView.findProductByTypeGuest();
                break;
            case 5:
                productView.sortASC();
                break;
            case 6:
                productView.sortDESC();
                break;
            case 7:
                paymentView.order();
                break;
            case 8:
                action();
                break;
            case 9:
                exit();
                break;
            default:
                System.out.println("⚔Chọn chức năng không đúng vui lòng chọn lại!⚔");
                break;
            }
        } catch (NumberFormatException e) {
            System.err.println("  ⚔ Lựa chọn phải là một số! ⚔");
        }

    }

    public static void exit() {
        System.out.println("\t\t\t\t\t\tCám ơn quý khách");
        System.out.println("\t\t\t\t\t\t ✌ Hẹn gặp lại ✌");

        System.exit(0);
    }

}
