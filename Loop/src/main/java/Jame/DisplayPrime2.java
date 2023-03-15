package Jame;

public class DisplayPrime2 {
    public static void main(String[] args) {

        int count = 0;
        System.out.println("Các số nguyên tố từ 2 đến 100:");
        for (int N = 2; N < 100; N++) {
                for (int j = 1; j <= N; j++) {
                    if (N % j == 0) {
                        count += 1;
                    }
                }
                if (count == 2) {
                    System.out.println(N);
                }
                count = 0;
        }
    }
}
