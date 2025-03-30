import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Task11_BasicQueueOperations {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Прочитам трите входни елемента на един ред за удобство
		System.out.println("Enter operations info:");
		String[] operationInfo = sc.nextLine().split(" ");
		int elementsToAdd = Integer.parseInt(operationInfo[0]);
		int elementsToDequeue = Integer.parseInt(operationInfo[1]);
		int elementToFind = Integer.parseInt(operationInfo[2]);
		ArrayDeque<Integer> queue = new ArrayDeque<>(elementsToAdd);
		System.out.println("Enter data:");
		String[] input = sc.nextLine().split(" ");
		int[] inputAsInt = Arrays.stream(input)
						.mapToInt(Integer::parseInt)
								.toArray();
		for (int i = 0; i <= inputAsInt.length - 1; i++) {
			queue.add(inputAsInt[i]);
		}

		for (int i = 0; i <= elementsToDequeue - 1; i++) {
			queue.poll();
		}

		if(queue.isEmpty()){
			System.out.println(0);
		} else{
			int min = Integer.MAX_VALUE;
			for (int i = 0; i <= queue.size() - 1; i++) {
				int currentNum = queue.poll();
				if(currentNum == elementToFind){
					System.out.println("true");
					return;
				}else if(currentNum < min){
					min = currentNum;
				}
			}
			System.out.println(min);
		}

	}
}
