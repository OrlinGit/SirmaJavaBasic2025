import java.util.Scanner;

public class Task12_SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        double firstNumber = Double.parseDouble(sc.nextLine());
        System.out.println("Enter second number:");
        double secondNumber = Double.parseDouble(sc.nextLine());
        System.out.println("Enter function");
        String function = sc.nextLine();
        double result = 0.0;
        if (function.equals("add")){
            result = firstNumber + secondNumber;
        } else if (function.equals("subtract")) {
            result = firstNumber - secondNumber;
        } else if (function.equals("divide")){
            result = firstNumber / secondNumber;
        } else if (function.equals("multiply")) {
            result = firstNumber * secondNumber;
        }
        System.out.printf("%.2f", result);
    }
}
