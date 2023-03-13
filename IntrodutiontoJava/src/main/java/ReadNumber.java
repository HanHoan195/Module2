import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number:");
        int number = scanner.nextInt();

        //number < 10
        String num = "";
        switch (number){
            case 0:
                num = "Zero";
                break;
            case 1:
                num = "One";
                break;
            case 2:
                num = "Two";
                break;
            case 3:
                num = "Three";
                break;
            case 4:
                num = "Four";
                break;
            case 5:
                num = "Five";
                break;
            case 6:
                num = "Six";
                break;
            case 7:
                num = "Seven";
                break;
            case 8:
                num = "Eight";
                break;
            case 9:
                num = "Nine";
                break;
        }
        System.out.print(num);
        // 10 den 19
        if(10<= number && number <20){
            int Numteen = number - 10;
            String numteen ="";
            switch (Numteen){
                case 0:
                    numteen = "Ten";
                    break;
                case 1:
                    numteen = "Eleven";
                    break;
                case 2:
                    numteen = "Twenty";
                    break;
                case 3:
                    numteen = "Thirty";
                    break;
                case 4:
                    numteen = "fourteen";
                    break;
                case 5:
                    numteen = "Fifteen";
                    break;
                case 6:
                    numteen = "Sixteen";
                    break;
                case 7:
                    numteen = "Seventeen";
                    break;
                case 8:
                    numteen = "Eighteen";
                    break;
                case 9:
                    numteen = "Nineteen";
                    break;
            }
            System.out.println(numteen);
        } else if (100<= number && number <1000) {
            int hundreds = number / 100;
            String Hundreds = "";
            switch (hundreds) {
                case 1:
                    Hundreds = "One hundreds";
                    break;
                case 2:
                    Hundreds = "Two hundreds";
                    break;
                case 3:
                    Hundreds = "Three hundreds";
                    break;
                case 4:
                    Hundreds = "Four hundreds";
                    break;
                case 5:
                    Hundreds = "Five hundreds";
                    break;
                case 6:
                    Hundreds = "Six hundreds";
                    break;
                case 7:
                    Hundreds = "Seven hundreds";
                    break;
                case 8:
                    Hundreds = "Eight hundreds";
                    break;
                case 9:
                    Hundreds = "Nine hundreds";
                    break;
            }
            System.out.print(Hundreds);
//        } else if (20<= number && number<100) {
            int tens =hundreds / 10;
            String Tens = "";
            switch (tens){
                case 2:
                    Tens = "Twenty";
                    break;
                case 3:
                    Tens = "Thirty";
                    break;
                case 4:
                    Tens = "Fourty";
                    break;
                case 5:
                    Tens = "Fifty";
                    break;
                case 6:
                    Tens = "Sixty";
                    break;
                case 7:
                    Tens = "Seventy";
                    break;
                case 8:
                    Tens = "Eighty";
                    break;
                case 9:
                    Tens = "Ninety";
                    break;
            }
            System.out.print(Tens + " ");

            int unit = tens % 10;
            String Unit = "";
            switch (unit){
                case 1:
                    Unit = "One";
                    break;
                case 2:
                    Unit = "Two ";
                    break;
                case 3:
                    Unit = "Three";
                    break;
                case 4:
                    Unit = "Four";
                    break;
                case 5:
                    Unit = "Five";
                    break;
                case 6:
                    Unit = "Six";
                    break;
                case 7:
                    Unit = "Seven";
                    break;
                case 8:
                    Unit = "Eight";
                    break;
                case 9:
                    Unit = "Nine";
                    break;
            }
            System.out.print(Unit);


        }
    int a =5, b = 7;
        int c = a++ + ++b;
        System.out.println(c);

    }
}
