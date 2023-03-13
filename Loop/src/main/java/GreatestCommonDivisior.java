import java.util.Scanner;

public class GreatestCommonDivisior {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        a = scanner.nextInt();
        System.out.print("Enter b: ");
        b = scanner.nextInt();

        if(a == 0 || b== 0){
            System.out.println("No greatest commmon");
        }
        while (a != b){
            if(a > b){
                a = a - b;
            } else {
                b = b - a;
            }
        }
        System.out.println("Greatest common divisor: " + a);
    }
}
