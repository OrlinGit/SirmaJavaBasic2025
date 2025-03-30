import java.util.Scanner;

public class Task2_LargerNUmber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int firstNumber = Integer.parseInt(sc.nextLine());
        System.out.println("Enter second number:");
        int secondNumber = Integer.parseInt(sc.nextLine());
        if(firstNumber > secondNumber){
            System.out.println(firstNumber);
        }else{
            System.out.println(secondNumber);
        }
    }
}

/* Втори начин за решаване на задачата:

import java.util.Scanner;

public class Task2_LargerNUmber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int firstNumber = Integer.parseInt(sc.nextLine());
        System.out.println("Enter second number:");
        int secondNumber = Integer.parseInt(sc.nextLine());
        System.out.println(Math.max(firstNumber, secondNumber));
    }
}

 */

