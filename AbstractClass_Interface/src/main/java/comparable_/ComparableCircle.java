package comparable_;

import java.util.Arrays;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle>{
    public ComparableCircle(){

    }
    public ComparableCircle(float radius){
        super();
    }
    public ComparableCircle(float radius,String color, boolean filled){
        super(radius, color, filled);
    }

    @Override
    public int compareTo(ComparableCircle o) {
       if(getRadius()> o.getRadius()) return 1;
       else if (getRadius() < o.getRadius()) return -1;
       else return 1;
    }
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.6F);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle(3.5F,"indigo",false);

        System.out.println("Pre-sorted: ");
        for (ComparableCircle circle : circles){
            System.out.println(circle);
        }
        Arrays.sort(circles);

        System.out.println("After-sorted: ");
        for (ComparableCircle circle : circles){
            System.out.println(circle);
        }
    }
}
