package comparable2;

import java.util.Arrays;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle>{
    public ComparableCircle(){

    }
    public ComparableCircle(float radius){
        super(radius);
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

}
