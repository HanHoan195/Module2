package excercise;

import java.util.Comparator;

public class ComparatorByDate implements Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2) {
        return o1.getCreateAt().compareTo(o2.getCreateAt());
    }
}
