import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task01_ReverseNumbersStack {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integers:");
		String inputValues = sc.nextLine();
		ArrayList<Integer> input = (ArrayList<Integer>) Arrays.stream(inputValues.split(" "))
				.map(Integer::parseInt)
				.collect(Collectors.toList());

		ArrayDeque<Integer> reverseStack = new ArrayDeque<>();
		for (int i = 0; i < input.size(); i++) {
			reverseStack.push(input.get(i));
		}
		for(int value: reverseStack){
			System.out.print(value + " ");
		}

	}
}
