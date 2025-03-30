import java.util.ArrayDeque;
import java.util.Scanner;

public class Task10_MaximumElement {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of commands:");
		int numberOfCommands = Integer.parseInt(sc.nextLine());
		ArrayDeque<Integer> stack = new ArrayDeque<>();
		for (int i = 0; i <= numberOfCommands - 1; i++) {
			String[] command = sc.nextLine().split(" ");
			if(command[0].equals("1")){
				int number = Integer.parseInt(command[1]);
				stack.push(number);
			} else if (command[0].equals("2")) {
				stack.pop();
			} else if (command[0].equals("3")) {
				if(stack.isEmpty()){
					System.out.println("The stack is empty. No max number!");
					return;
				}else{
					int endResult = findMax(stack);
					System.out.println(endResult);
				}
			}
		}
	}
	public static int findMax(ArrayDeque<Integer> currentStack){
		int max = Integer.MIN_VALUE;
		while(!currentStack.isEmpty()) {
			int currentNum = currentStack.pop();
			if(currentNum > max){
				max = currentNum;
			}
		}
		return max;
	}
}
