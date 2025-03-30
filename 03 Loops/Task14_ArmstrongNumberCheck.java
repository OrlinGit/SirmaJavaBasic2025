import java.util.Scanner;
public class Task14_ArmstrongNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int inputNum = Integer.parseInt(sc.nextLine());
        int armstrongNum = 0;
        int input = inputNum;
        String intToString = Integer.toString(inputNum);
        int pow = intToString.length();
        while (inputNum != 0){
            int currentDigit = inputNum % 10;
            armstrongNum += (int) Math.pow(currentDigit, pow);
            inputNum /= 10;
        }
        System.out.println(input == armstrongNum);
    }
}
