import java.util.Scanner;
import java.util.Arrays;
public class Task10_AddAndRemoveElementsFromArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array:");
		String[] commands = sc.nextLine().split(",");
		int addCounter = 0;
		int removeCounter = 0;
		for (int i = 0; i <= commands.length - 1; i++) {
			if(commands[i].equals("add")){
				addCounter++;
			} else if (commands[i].equals("remove")) {
				removeCounter++;
			}
		}
		if(removeCounter >= addCounter){
			System.out.println("Empty");
		} else{
			int[] arr = new int[addCounter - removeCounter];
			int j = 0; // Този брояч коригира итерациите след премахване на един елемент
			int k = 0; // Този брояч коригира стойността в клетката на масива при премахване на елемент
			for (int i = 0; i <= commands.length - 1; i++) {
				if(commands[i].equals("add")){
					arr[j] = k + 1;
					j++;
					k++;
				} else if (commands[i].equals("remove")) {
					arr[j - 1] = 0;
					j--;
				}
			}
			//принтирам с цикъл за да се форматира изхода без скобите
			for (int el = 0; el <= arr.length -1; el++) {
				System.out.print(arr[el] + " ");
			}
		}
	}
}
