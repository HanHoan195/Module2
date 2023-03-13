public class Wrapper {

    public static void main(String[] args) {
        //demo đổi kiểu nguyên thủy sang kiêur đối tượng
//        int a = 20;
//        Integer i = Integer.valueOf(a);
//        Integer j = a;
//        //System.out.println(a + " " + i + " " + j);
//
//
//        // kiểu đối tượng sang kểu nguyên thủy
//        Integer k = new Integer(2);
//        int h = k.intValue();
//        int l = k;
//       //System.out.println(k + " " + h + " " + l);


        //truyền giá trị cho phương thức đc gọi là truyền tham trị dành các kiểu dữ liệu nguyên thủy
        // giá trị thay đổi trong hàm swap khi ra khỏi hm swap thì ko thay đổi

        class Main{
            public static void swap(int n1, int n2){
                System.out.println("\t Giá trị các biến bên trong hàm swap");
                System.out.println("\t\t Trước khi swap, n1 = " + n1 + " và n2 = " + n2);
                int temp = n1;
                n1 = n2;
                n2 = temp;
                System.out.println("\t\tSau khi swap n1 = " + n1 + " và n2 = " + n2 );
            }
            public static void main(String[] args){
                int num1 = 1;
                int num2 = 2;
                System.out.println("Trước khi gọi hàm swap num 1 = " + num1 + " và num2 = " + num2);
                System.out.println("Ssau khi gọi hàm swap num1 = " + num1 + " và num2 = " + num2);
            }
        }



    }
}
