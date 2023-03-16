public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();//gọi method
        //khởi tạo đốitượng
        Student s1 = new Student(1 , "Hoàn");
        Student s2 = new Student(2 , "Pháp");
        Student s3 = new Student(3 , "Nghĩa");

        //gọi hàm display
        s1.display();
        s2.display();
        s3.display();
    }
}
