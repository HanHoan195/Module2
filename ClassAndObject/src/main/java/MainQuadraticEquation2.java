import java.util.Scanner;

public class MainQuadraticEquation2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter b: ");
        double b = scanner.nextDouble();
        System.out.println("Enter c: ");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        double delta = quadraticEquation.getDiscriminant();
        double x = quadraticEquation.getDoubleSolution();
        double r1 = quadraticEquation.getRoot1();
        double r2 = quadraticEquation.getRoot2();

        if( delta <0){
            System.out.println("Phương trình vô nghiệm.");
        }
        if (delta == 0) {
            System.out.println("Phương trình có nghiệm kép x = " + x );
        }
        if (delta > 0) {
            System.out.println("Phương trình có hai nghiêm: \n x1 = " + r1 + "\n x2 = " + r2) ;
        }
    }
}
