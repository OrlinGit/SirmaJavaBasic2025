import java.util.Scanner;

class GFG {
    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        // Initialize count to keep track of divisors
        int count = 0;
        // Check if the number is less than 2, as numbers less than 2 are not prime
        if (n < 2) {
            return false;
        }
        // Iterate from 2 to the square root of the number
        // If any number between 2 and sqrt(n) divides n, it's not prime
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                count++;
            }
        }
        // If count is still 0, it means n is prime as it has no divisors other than 1 and itself
        if (count == 0) {
            return true;
        }
        // Return false if count is not 0
        return false;
    }
}

public class Task29_UniqueCodes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int firstNumber = Integer.parseInt(sc.nextLine());
        System.out.println("Enter second number:");
        int secondNumber = Integer.parseInt(sc.nextLine());
        System.out.println("Enter third number:");
        int thirdNumber = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= firstNumber; i++) {
            for (int j = 1; j <= secondNumber ; j++) {
                for (int k = 1; k <= thirdNumber ; k++) {
                    if (i % 2 == 0 && GFG.isPrime(j) && k % 2 == 0){
                        System.out.printf("%d%d%d%n", i, j, k);
                    }
                }
            }
        }
    }
}
