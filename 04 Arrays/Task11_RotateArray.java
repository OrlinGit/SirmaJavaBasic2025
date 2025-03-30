import java.util.Arrays;
import java.util.Scanner;
public class Task11_RotateArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array:");
		String[] array = sc.nextLine().split(",");
		System.out.println("Enter number of rotations:");
		int rotations = Integer.parseInt(sc.nextLine());
		String[] arrayModified = new String[array.length];
		//използвам тази паразитна променлива за по-лесно следене на индекса в единия масив
		int k = array.length - 2;
		for (int i = 0; i < rotations; i++) {
			for (int j = array.length - 1; j >= 0; j--) {
				if (j == 0){
					k = array.length - 1;
				}
				arrayModified[j] = array[k];
				k--;
			}
			System.arraycopy(arrayModified, 0, array, 0, array.length);
		}
		for (int m = 0; m <= arrayModified.length - 1; m++) {
			System.out.print(arrayModified[m] + " ");
		}
	}
}
