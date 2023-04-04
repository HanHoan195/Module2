package demo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
    //Để Set/HashSet đảm bảo các phần tử không trùng lặp,
    // ta cần đảm bảo rằng đối tượng được thêm vào Set/HashSet phải có mã băm (hash code)
    // và phương thức so sánh bằng (equals) được định nghĩa đúng cách.
    //khi thêm một đối tượng Set/HashSet nó sẽ kểm tra mã băm của đối tượng đó và so sánh vs các đối tượng khác
    //trong Set/HashSet bằng phương thức so sánh bằng, nếu không có đối tượng nào có cùng mã băm và đc coi là
    //giống nhau thì đối tượng đó sẽ thêm vào hashset , nếu giống nhau thì sẽ bị loại bỏ.
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        //thêm một phần tử đã có trong hashset
        set.add(2);

        for (int element : set){
            System.out.println("Các phần tử trong hashset: " + element);
        }

        //KQ: Các phần tử trong hashset: 1
        //    Các phần tử trong hashset: 2
        //    Các phần tử trong hashset: 3
        // phần tử 2 đc thêm hai lần nhưng hashset chỉ nhận 1 giá trị



    }
}
