package Jame;

import java.util.Scanner;

public class DisplayPrime {
    public static boolean isPrimeNumber(int num) {
        if (num < 2) {
            return false;
        }

        int squareRoot = (int) Math.sqrt(num);
        for (int i = 2; i <= squareRoot; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập number : ");
        int num = scanner.nextInt();
        System.out.printf("%d số nguyên tố đầu tiên là: \n", num);
        int count = 0; // đếm số số nguyên tố
        int i = 2;   // tìm số nguyên tố bắt dầu từ số 2
        while (count < num) {
            if (isPrimeNumber(i)) {
                System.out.print(i + " ");
                count++;
            }
            i++;
        }
    }
}