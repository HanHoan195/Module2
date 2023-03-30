package book;

import java.util.Comparator;

public class ComparatorByDecription implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getDescription().compareTo(o2.getDescription());
    }
}
