package linkedlist2;

public class Test {
    public static void main(String[] args) {
        System.out.println("-----TESTING-----");
        MylinkedList<Integer> linkList1 = new MylinkedList<>(10);
//        linkList1.addFirst(11);
//        linkList1.addFirst(12);
//        linkList1.addFirst(13);
      // linkList1.printList();

        linkList1.add(0, 2);
        linkList1.add(5, 6);
        linkList1.add(3, 2);
        linkList1.addLast(12);
        linkList1.removeAtPosition(4);
        linkList1.printList();
        System.out.println(linkList1.size());
        System.out.println(linkList1.getFirst() + ", " );
    }
}
