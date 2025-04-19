import java.util.Arrays;
import java.util.Scanner;

public class Task19_ArrayManipulations {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array to manipulate: ");
		String[] arrayToManipulate = sc.nextLine().split(" ");
		int[] arrayInt = Arrays.stream(arrayToManipulate)
				.mapToInt(Integer::parseInt)
				.toArray();
		System.out.println("Enter commands line:");
		String[] commandsArray = sc.nextLine().split(", ");

		for (int i = 0; i < commandsArray.length; i++) {
			String[] currentCommand = commandsArray[i].split(" ");
			String command = currentCommand[0];
			if (command.equals("Add")) {
				int numberToAdd = Integer.parseInt(currentCommand[1]);
				int[] newArray = Arrays.copyOf(arrayInt, arrayInt.length + 1);
				newArray[newArray.length - 1] = numberToAdd;
				arrayInt = Arrays.copyOf(newArray, newArray.length);
			} else if (command.equals("Remove")) {
				int numberToRemove = Integer.parseInt(currentCommand[1]);
				int[] newArray = new int[arrayInt.length - 1];
				int index = 0;
				for (int j = 0; j < newArray.length; j++) {
					if (arrayInt[index] == numberToRemove) {
						index++;
					}
					newArray[j] = arrayInt[index++];
				}
				arrayInt = Arrays.copyOf(newArray, newArray.length);
			} else if (command.equals("RemoveAt")) {
				int indexToRemove = Integer.parseInt(currentCommand[1]);
				int[] newArray = new int[arrayInt.length - 1];
				int index = 0;
				for (int j = 0; j < newArray.length; j++) {
					if (j == indexToRemove) {
						index++;
					}
					newArray[j] = arrayInt[index++];
				}
				arrayInt = Arrays.copyOf(newArray, newArray.length);
			} else if (command.equals("Insert")) {
				int numberToAdd = Integer.parseInt(currentCommand[1]);
				int indexToAdd = Integer.parseInt(currentCommand[2]);
				int[] newArray = new int[arrayInt.length + 1];
				int index = 0;
				for (int j = 0; j < newArray.length; j++) {
					if (j == indexToAdd) {
						newArray[j] = numberToAdd;
						continue;
					}
					newArray[j] = arrayInt[index++];
				}
				arrayInt = Arrays.copyOf(newArray, newArray.length);
			}
		}
		System.out.println(Arrays.toString(arrayInt));
	}
}
