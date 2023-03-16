public class Student {
    private int rollno;
    private String name;
    private static String college = "BBIT";

    //constructor
    Student (int r, String n){
        rollno = r;
        name = n;
    }

    //static method
     static void change(){
        college = "CODEGYM";
     }

     //display
    void display(){
        System.out.println(rollno + " " + name + " " + college);
    }
}
