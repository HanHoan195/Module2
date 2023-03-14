package Jame;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean checkActionMenu = false;

        do {
            System.out.println("1. Tổng các phấn tử trong mảng");
            System.out.println("2. Mảng có bao nhiêu số chẵn");
            System.out.println("3. Giá trị nhỏ nhất trong mảng");
            System.out.println("4. Gộp mảng");
            System.out.println("5. Thêm phần tử vào mảng");
            System.out.println("Chọn chức năng cần in ra");
            int actionMenu = scanner.nextInt();
            switch (actionMenu){
                case 1:
                    sumArray(arr);
                    break;
                case 2:
                    countEven(arr);
                    break;
                case 3:
                    findMin(arr);
                    break;
                case 4:
                    mergeArray(arr);
                    break;
                case 5:
                    pushArray(arr);

                     }
                     checkActionMenu = true;
        } while (checkActionMenu);


       // tổng trong mảng
       // đếm mảng có bao nhiêu số chẵn
       //  Tìm giá trị nhor nhất
    //        gộp mảng
    //        thêm phần tử vào mangr




    }
    public static int[] arr ={7,4,6,1,3};
    public static void sumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Total = " + sum);
    }

    public static void countEven(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count += 1;
            }
        }
        System.out.println("Count even: " + count);
    }

    public static void findMin(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất là: " + min);
    }

    public static void mergeArray(int[] arr){
        int[] arr2 = {9, 2, 8};
        int[] arr3 = new int[arr.length + arr2.length];
        for (int i = 0; i < arr.length; i++) {
            arr3[i] = arr[i];
        }
        for (int j = 0; j < arr2.length; j++) {
            arr3[arr.length + j] = arr2[j];
        }
        System.out.println("Mảng gộp: " + arr3);
    }

    public static void pushArray(int[] arr){
        int[] number = {1};
        int[] arr2 = {arr.length + number.length};
        for (int i = 0;i< arr.length;i++){
            arr2[i] = arr[i];
        }
        for(int j = 0;j< number.length;j++){
            arr2[arr.length + j] = number[j];
        }
        System.out.println("Mảng mới : " + arr2);
    }

}
