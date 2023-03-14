package Jame;

import java.util.Scanner;

public class BankInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số tiền vay: ");
        double money = scanner.nextDouble();
        System.out.print("Nhập số tháng: ");
        int month = scanner.nextInt();
        System.out.print("Nhập lãi suất: ");
        double interes = scanner.nextDouble();
        double bankInterest = money * (interes /100) /12 * month;
        double total = 0;
        for (int i =0;i<month;i++){
            total += bankInterest;
        }
        System.out.println("Lãi suất sau " + month + " tháng là : " + total);
    }
}
