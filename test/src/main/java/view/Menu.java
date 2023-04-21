package view;

import java.util.Scanner;

public class Menu {
    static StudentView studentView = new StudentView();
    static Scanner scanner = new Scanner(System.in);

   public void menu(){
       System.out.println("------MENU-------");
       System.out.println("1. Hiển thị danh sánh sản phẩm");
       System.out.println("2. Thêm mới sinh viên");
       System.out.println("3. Cập nhật sinh viên");
       System.out.println("4. Xóa sinh viên");
       System.out.println("5. Sắp xếp sinh viên theo điểm trung bình lớn dần");
       System.out.println("6. Sắp xếp sinh viên theo điểm trung bình nhỏ dần");
       System.out.println("8. Thoát");
   }
    public void action(){
       boolean checkMenu = true;
       do {
           menu();
           Scanner scanner1 = new Scanner(System.in);
           System.out.println("Chọn chức năng:");
           System.out.println();
           int choice = -1;
           try {
               choice = Integer.parseInt(scanner.nextLine());
           } catch (Exception e){
               System.out.println("Lựa chọn l một số!");
           }
               switch (choice){
                   case 1:
                       studentView.showStudent();
                       break;
                   case 2:
                    studentView.addStudent();
                    break;
                   case 3:
                       studentView.updateStudent();//chưa xong
                               break;
                   case 4:
                       studentView.deleteStudent();
                       break;
                   case 5:
                       studentView.sortStudentByDTB();
                       break;
                   case 6:
                       studentView.sorDTBDESC();
                       break;
                   case 8:
                       studentView.Exit();
                       break;
                   default:
                       System.out.println("Lựa chọn không hợp lệ");
               }

       } while (true);

    }


    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.action();
    }

}
