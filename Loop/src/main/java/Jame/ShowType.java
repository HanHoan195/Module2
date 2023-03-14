package Jame;

import java.util.Scanner;

public class ShowType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean checkMenu = false;
        do {
            System.out.println("Chọn hình cần in: ");
            System.out.println("Nhấn 1: In hình chữ nhật ");
            System.out.println("Nhấn 2: In hình tam giác ");

            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    printRectangle();
                    break;
                case 2:
                    printRightTriangle();
                    break;
            }
            checkMenu = true;
        } while (checkMenu);
    }

    public static void printRectangle(){
        int w = 5;
        int h = 8;
        for (int i = 0; i<w;i++ ){
            for (int j = 0;j<h;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    public static void printRightTriangle(){
        for (int i = 0;i<=5;i++){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
