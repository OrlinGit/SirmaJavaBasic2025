import java.util.Scanner;

public class Task3_NumbersWithWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = Integer.parseInt(sc.nextLine());
        String numberInString = "";
        /* Тук се предполага от изхода "too big", че на входа ще се подават само положителни числа.
        Ако на входа ще се опдават и отрицателни числа тогава if проверката трябва да е:
        if (number < 0 || number > 9)
         */
        if (number > 9){
            System.out.println("too big");
        }else{
            if (number == 0){
                numberInString = "zero";
            } else if(number == 1){
                numberInString = "one";
            } else if(number == 2){
                numberInString = "two";
            } else if(number == 3){
                numberInString = "three";
            } else if(number == 4){
                numberInString = "four";
            } else if(number == 5) {
                numberInString = "five";
            } else if(number == 6) {
                numberInString = "six";
            } else if(number == 7) {
                numberInString = "seven";
            } else if(number == 8) {
                numberInString = "eight";
            } else if(number == 9) {
            numberInString = "nine";
            }
            System.out.println(numberInString);
        }
    }
}

/* При този метод на решение можем да се възползваме от switch-case структурата за улеснен азапис на кода,
    но тогава входа от конзолата няма да е тип int, а ще е тип String.


import java.util.Scanner;

public class Task3_NumbersWithWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        String number = sc.nextLine();
        String numberInString = "";
        switch (number){
            case "0":
                numberInString = "zero";
                break;

            case "1":
                numberInString = "one";
                break;

            case "2":
                numberInString = "two";
                break;

            case "3":
                numberInString = "three";
                break;

            case "4":
                numberInString = "four";
                break;

            case "5":
                numberInString = "five";
                break;

            case "6":
                numberInString = "six";
                break;

            case "7":
                numberInString = "seven";
                break;

            case "8":
                numberInString = "eight";
                break;

            case "9":
                numberInString = "nine";
                break;

            default:
                numberInString = "too big";
        }
        System.out.println(numberInString);
    }
}
 */