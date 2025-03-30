import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int numOne = Integer.parseInt(sc.nextLine());
        System.out.println("Enter second number:");
        int numTwo = Integer.parseInt(sc.nextLine());

        int sumOfNumbers = numOne + numTwo;
        int diffOfNumbers = numOne - numTwo;
        int multiplicationOfNumbers = numOne * numTwo;
        double averageOfNumbers = (numOne + numTwo) / 2;

        System.out.println("The sum is: " + sumOfNumbers);
        System.out.println("The difference is: " + diffOfNumbers);
        System.out.println("The product is: " + multiplicationOfNumbers);
        System.out.printf("The average is: %.6f", averageOfNumbers);
    }
}
