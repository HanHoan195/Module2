package bai12;

import java.util.Comparator;

public class ComparatorByManufacture implements Comparator<RoadTransport> {
    @Override
    public int compare(RoadTransport o1, RoadTransport o2) {
        return o1.getManufacture().compareTo(o2.getManufacture());
    }
}
