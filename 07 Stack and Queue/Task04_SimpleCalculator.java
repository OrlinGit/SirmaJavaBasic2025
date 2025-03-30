import java.util.ArrayDeque;
import java.util.Scanner;

public class Task04_SimpleCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter formula:");
		String[] input = sc.nextLine().split(" ");
		ArrayDeque<String> formulaStack = new ArrayDeque<>();
		int sum = 0;
		String nextSymbol;
		int firstSymbol;
		/* Използвам променливата counter за да си осигуря необходимия брой итерации
		без да се влиаят от непрекъснато променящия се размер на Stack-a.
		Добавям +1 итерация за да уловя първата(останала последна) цифра.
		 */
		int counter = input.length + 1;
		for (int i = 0; i <= input.length - 1; i++) {
			formulaStack.push(input[i]);
		}
		for (int i = 0; i <= counter; i++) {
			/* На променливата firstSymbol присвоявам последния елемент в Stack-a,
			който винаги е цифра (при правилно написана формула).
			 */
			firstSymbol = Integer.parseInt(formulaStack.pop());
			if(formulaStack.isEmpty()){
				sum += firstSymbol;
				System.out.println(sum);
				break;
			}else{
				/* На променливата nextSymbol присвоявам стойността след firstSymbol,
				която винаги в знак(при правилно написана формула).
				 */
				nextSymbol = formulaStack.pop();
			}
			if(nextSymbol.equals("+")){
				sum += firstSymbol;
			} else if (nextSymbol.equals("-")) {
				sum-= firstSymbol;
			}
		}

	}
}
