import java.util.Arrays;
import java.util.Scanner;

public class Task18_ListOfProducts {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter list of products:");
		String[] array = sc.nextLine().split(", ");
		String[] orderedArray = new String[array.length];
		int smallestNumber = Integer.MAX_VALUE;
		int currentIndex = 0;
		boolean isTrue = true;
		String lastElement = "a";
		while (isTrue) {
			for (int i = 0; i <= orderedArray.length - 1; i++) {
				for (int j = 0; j <= array.length - 1; j++) {
					String word = array[j];
					if (word.charAt(0) < smallestNumber) {
						smallestNumber = word.charAt(0);
						currentIndex = j;
					}
				}
				orderedArray[i] = array[currentIndex];
				String[] arrCurrent = new String[array.length - 1];
				for (int s = 0; s <= array.length - 1; s++) {
					int indexInCurrentArray = 0;
					if(s == currentIndex){
						continue;
					}
					arrCurrent[indexInCurrentArray++] = array[s];
				}
				/*for (String element : orderedArray) {
					if (element == array[currentIndex]) {
						break;
					} else {
						orderedArray[i] = array[currentIndex];
					}
				}

				 */
				lastElement = orderedArray[orderedArray.length - 1];
				if(lastElement != "null"){
					isTrue = false;
				}
			}
		}
		System.out.println(Arrays.toString(orderedArray));
	}
}
