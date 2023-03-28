package arraylist;

public class Test {
    public static void main(String[] args) {
        MyList<Integer> newList = new MyList<>();

        newList.add(3);
        newList.add(4);
        newList.add(5);
        newList.add(6);
        newList.add(3);
        newList.add(8);
        newList.add(9);
        newList.add(0);
        newList.add(1);
        newList.add(2);
       // System.out.println(newList);

        newList.add(0, 7);
       // System.out.println(newList);

//        newList.remove(5);
//        newList.remove(6);
        newList.remove(7);
        //System.out.println(newList);

        System.out.println(newList.size());
        System.out.println(newList.contains(12));
    }
}
