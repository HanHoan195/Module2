import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.print("Enter your weight(kg): ");
        weight = scanner.nextDouble();
        System.out.print("Enter your height(m): ");
        height = scanner.nextDouble();
        bmi = weight /(height * height);

        //check bmi
        if(bmi < 18.5){
            System.out.println("BMI: " + bmi + ": under weight");
        } else if (bmi < 25){
            System.out.println("BMI: " + bmi + ": normal ");
        } else if (bmi < 30) {
            System.out.println("BMI: " + bmi + ": over weight");
        } else if (30 < bmi) {
            System.out.println("Obese");
        }


    }
}
