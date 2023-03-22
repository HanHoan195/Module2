package resizeable;

import java.util.Comparator;

public class ComparatorGeometricByArea implements Comparator<Geometric> {
    @Override
    public int compare(Geometric o1, Geometric o2) {
        if (o1.getArea() > o2.getArea()) {
            return 1;
        } else if (o1.getArea() < o2.getArea()){
            return -1;
        } else {
            return 0;
        }
    }
}
