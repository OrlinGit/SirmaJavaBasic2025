import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task02_BasicStackOperations {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/* Прочитам в един масив входните данни. Използвам масив,
		защото от първия ред идват винаги три входни променливи
		 */
		System.out.println("Enter input data:");
		String[] input = sc.nextLine().split(" ");
		int[] inputData = Arrays.stream(input)
				.mapToInt(Integer::parseInt)
				.toArray();
		/*
		Записвам си входните числа тъй като идват всички на един ред и с учебна цел.
		Предполагам може да се направи и директно с for цикъл, който да записва числата докато постъпват от конзолата.
		 */
		System.out.println("Enter line of numbers:");
		String inputValues = sc.nextLine();
		ArrayList<Integer> inputStream = (ArrayList<Integer>) Arrays.stream(inputValues.split(" "))
				.map(Integer::parseInt)
				.collect(Collectors.toList());
		int lengthOfStack = inputData[0];
		int elementsToPop = inputData[1];
		int elementToFind = inputData[2];
		ArrayDeque<Integer> stack = new ArrayDeque<>();
		for (int i = 0; i <= (lengthOfStack - 1); i++) {
			stack.push(inputStream.get(i));
		}
		for (int i = 0; i < elementsToPop; i++) {
			stack.pop();
		}

		if(stack.isEmpty()) {
			System.out.println(0);
		} else if (stack.contains(elementToFind)) {
			System.out.println("true");
		} else if (!stack.contains(elementToFind)){
			int minElement = stack.pop();
			for (int i = 0; i < stack.size(); i++) {
				int currentElement = stack.pop();
				if(currentElement < minElement){
					minElement = currentElement;
			}
			}
			System.out.println(minElement);
		}
/*
		for (int value : stack) {
			System.out.println(value);
		}
*/
	}
}
