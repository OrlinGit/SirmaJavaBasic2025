import java.util.ArrayDeque;
import java.util.Scanner;
public class Task09_HotPotato {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter names:");
		String[] input = sc.nextLine().split(" ");
		System.out.println("Enter count:");
		Integer count = Integer.parseInt(sc.nextLine());
		ArrayDeque<String> queue = new ArrayDeque<>();
		for (int i = 0; i <= input.length - 1; i++) {
			queue.add(input[i]);
		}

		while (queue.size() > 1) {
		/*
		Презаписваме опашката count-1 пъти. По този начин детето, което трябва да получи картофа и да напусне играта
		остава на първа позиция на опашката.
 		*/
			for (int i = 1; i <= count - 1; i++) {
				String currentChild = queue.poll();
				queue.add(currentChild);
			}
			//Махаме първа позиция на опашката (детето, в което е останал картофа)
			System.out.println("Remove " + queue.poll());
		}
		System.out.println("Last is " + queue.poll());
	}
}
