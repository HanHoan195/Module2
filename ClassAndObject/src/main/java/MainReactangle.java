import java.util.Scanner;

public class MainReactangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Width: ");
        double width = scanner.nextDouble();
        System.out.println("Enter Height: ");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);

        System.out.println("Your rectangle: \n" + rectangle.display());
        System.out.println("Perimeter of the rectangle :\n" + rectangle.getPerimeter());
        System.out.println("Area of the rectangle: \n" + rectangle.getArea());

    }
}
