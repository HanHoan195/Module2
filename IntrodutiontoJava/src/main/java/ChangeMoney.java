import java.util.Scanner;

public class ChangeMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Amount to exchange(dollar):");
        double money = scanner.nextDouble();
       double rate = money * 23000;
        System.out.println(money + "(dollar) = " + rate + "VND" );
    }
}
