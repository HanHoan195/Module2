package Jame;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        if(number <= 1){
            System.out.printf("%s không phải là số nguyên tố",number);
        }
        for (int i = 2; i< number;i++){
            if(number % i == 0){
                System.out.printf("%s không phải số nguyên tố",number);
                break;
            } else {
                System.out.printf("%s là số nguyên tố", number);
                break;
            }
        }

    }
}
