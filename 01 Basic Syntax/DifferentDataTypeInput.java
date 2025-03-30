import java.util.Scanner;

public class DifferentDataTypeInput {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string:");
        String inputStr = scanner.nextLine();

        System.out.println("Enter character:");
        char inputChr = scanner.nextLine().charAt(0);

        System.out.println("Enter integer:");
        //String inputInt = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter double:");
        double inputDouble = Double.parseDouble(scanner.nextLine());

        System.out.println("String is:" + inputStr);
        System.out.println("Character is:" + inputChr);
        System.out.println("Integer is:" + number);
        System.out.println("Double is:" + inputDouble);

        System.out.printf("String is:" + inputStr + " ");
        System.out.printf("Character is:" + inputChr + " ");
        System.out.printf("Integer is:" + number + " ");
        System.out.printf("Double is:" + inputDouble);
    }
}
