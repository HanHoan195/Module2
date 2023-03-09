import java.util.Scanner;

public class FisrtDegreeEquation {
    //giải phương trình bậc nhất ax + b = c
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //nhập giá trị  a b c
        System.out.println("a : ");
        double a = scanner.nextDouble();

        System.out.println("b : ");
        double b = scanner.nextDouble();

        System.out.println("c :");
        double c = scanner.nextDouble();
        //tìm x
        if(a != 0){
            double answer = (c - b )/ a;
            System.out.printf("Equation pass with x = %f!\n", answer);
        } else {
            if(b==c){
                System.out.println("The solution is all x!");
            } else {
                System.out.println("NO solution!");
            }
        }
    }
}
