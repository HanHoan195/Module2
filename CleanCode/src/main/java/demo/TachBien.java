package demo;

public class TachBien {

    private static boolean isLeapYear1(int year){
        if(year % 4 == 0){
            if (year % 100 == 0){
                if(year % 400 == 0)
                    return true;
            } else {
                return true;
            }
        }
        return false;
    }

    //sau khi tách biến
    private static boolean isLeapYear(int year){
        boolean isDivisibleBy4 = year %4 ==0;
        if (isDivisibleBy4){
            boolean isDivisibleBy100 = year % 100 ==0;
            if (isDivisibleBy100){
                boolean isDivisibleBy400 = year % 400 ==0;
                if (isDivisibleBy400){
                    return true;
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    //tách hằng
    public static final char ADDITION = '+';
    public static final char SUBTRACTION = '-';
    public static final char MULTIPLICATION = '*';
    public static final char DIVISION = '/';

    public static int calculate(int firstOperand, int secondOperand, char operator) {
        switch (operator) {
            case ADDITION://ban đầu là toán tử +
                return firstOperand + secondOperand;
            case SUBTRACTION://ban đầu là toán tử -
                return firstOperand - secondOperand;
            case MULTIPLICATION://ban đầu là toán tử *
                return firstOperand * secondOperand;
            case DIVISION://ban đầu là toán tử /
                if (secondOperand != 0)
                    return firstOperand / secondOperand;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }


}
