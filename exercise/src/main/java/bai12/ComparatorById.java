package bai12;

import java.util.Comparator;

public class ComparatorById implements Comparator<RoadTransport> {
    @Override
    public int compare(RoadTransport o1, RoadTransport o2) {
        if (o1.getId()> o2.getId()){
            return 1;
        } else if (o1.getId()< o2.getId()) {
            return -1;
        } else {
            return 0;
        }
    }
}
