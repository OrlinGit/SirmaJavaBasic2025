import java.util.ArrayDeque;
import java.util.Scanner;

public class Task05_DecimalToBinaryConverter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter decimal number:");
		int decimal = Integer.parseInt(sc.nextLine());
		ArrayDeque<Integer> binary = new ArrayDeque<>();
		while(!(decimal == 0)){
			binary.push(decimal % 2);
			decimal /= 2;
		}
		for(int el : binary){
			System.out.print(binary.pop());
		}
	}
}
