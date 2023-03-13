import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while (choice != 0){
            System.out.println("Menu");
            System.out.println("1. Draw triangle");
            System.out.println("2. Draw square");
            System.out.println("3. Draw rectangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice");
            choice = scanner.nextInt();
        }
        switch (choice){
            case 0:
                System.out.println("Exit");

            case 1:
                System.out.println("Draw Triangle");
                drawTriangle();
                break;
            case 2:
                System.out.println("Draw Square");
                drawSquare();
                break;
            case 3:
                System.out.println("Draw Rectangle");
                drawRectangle();
                break;

        }







    }

    //vex tam giasc
    public static int size = 5;
    public static void drawTriangle() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size -i; i++) {
                System.out.println("* ");
            }
            System.out.println();
        }
    }
    //ve hinih vuong
    public static void drawSquare(){
        for (int i = 0; i < size; i++) {
            for (int j = 0; i < size; i++) {
                System.out.println("* ");
            }
            System.out.println();
        }
    }

            //ve hinh chux nhat
    public static void drawRectangle(){
        int w = 5;
        int h = 10;
        for (int i = 0;i<w;i++){
            for (int j = 0; j<h;j++){
                System.out.println("* ");
            }
            System.out.println();
        }
    }

}
