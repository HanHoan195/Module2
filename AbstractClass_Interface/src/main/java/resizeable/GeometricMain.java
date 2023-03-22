package resizeable;

import java.util.Arrays;
import java.util.Comparator;

import comparable2.Circle;

public class GeometricMain {
    public static void main(String[] args) {
        Geometric[] geometrics = new Geometric[5];
        geometrics[0] = new resizeable.Circle(6f);
        geometrics[1] = new Rectangle(6,4);
        geometrics[2] = new Rectangle(5,3);
        geometrics[3] = new resizeable.Circle(4f);
        geometrics[4] = new Rectangle(5,6);

        //so sánh các hình
       Comparator comparator = new ComparatorGeometricByArea();
       Arrays.sort(geometrics, comparator);
       printArray(geometrics);
    }
    public void basic(){ //resize
        Geometric geometric = new Rectangle(4,5) ;
        System.out.println("Diện tích: " + geometric.getArea());

        geometric.resize(0.5f);
        System.out.println("Diện tích sau khi resize: " + geometric.getArea());

    }
    public static void printArray(Geometric[] geometrics){
        for (int i = 0;i<geometrics.length;i++){
            System.out.println(geometrics[i]);
        }
    }
 public void basic1(){
        Geometric[] geometrics = new Geometric[3];
        geometrics[0] = new Rectangle(3,6);
        geometrics[0] = new Rectangle(4,6);
        geometrics[0] = new Rectangle(6,5);

        Comparator comparator = (Comparator) new ComparatorRectangeByArea();
        Arrays.sort(geometrics, comparator);
        printArray(geometrics);
 }
}
