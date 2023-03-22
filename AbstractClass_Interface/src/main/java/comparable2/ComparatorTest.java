package comparable2;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.5f);
        circles[1] = new Circle();
        circles[2] = new Circle(3.6f, "black",false);

        System.out.println("Pre-sorted:");
        for (Circle circle : circles){
            System.out.println(circle);
        }


        Comparator cirleComparator = new CircleComparator();
        Arrays.sort(circles, cirleComparator);

        System.out.println("After-sorted ");
        for (Circle circle : circles){
            System.out.println(circle);
        }
    }
}
