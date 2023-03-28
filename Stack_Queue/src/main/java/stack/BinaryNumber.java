package stack;

import java.util.Scanner;
import java.util.Stack;

public class BinaryNumber {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhập số muốn chuyển đổi: ");
        int x = scanner.nextInt();

        Stack<Integer> binary = new Stack<>();

        while (x != 0){
            int soDu = x %2;
            binary.push(soDu);
            x/=2;
        }
        //System.out.println(binary);
        while (!binary.isEmpty()){
            System.out.print( binary.pop());
        }


    }
}
