package List;

public class MylistTest {
    public static void main(String[] args) {
        Mylist<Integer> listInterger = new Mylist<Integer>();
        listInterger.add(1);
        listInterger.add(2);
        listInterger.add(3);
        listInterger.add(4);


        System.out.println("Element 4: " + listInterger.get(4));
        System.out.println("Element 1: " + listInterger.get(1));
        System.out.println("Element 2: " + listInterger.get(2));

//        listInterger.get(6);
//        System.out.println("Element 6: " + listInterger.get(6));
        listInterger.get(-1);
        System.out.println("Element -1: " + listInterger.get(-1));
    }
}
