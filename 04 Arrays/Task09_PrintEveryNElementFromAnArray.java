import java.util.Scanner;
public class Task09_PrintEveryNElementFromAnArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array:");
		String[] array = sc.nextLine().split(",");
		System.out.println("Enter element:");
		int el = Integer.parseInt(sc.nextLine());
		if (el > array.length){
			System.out.println(array[0]);
		}else {
			for (int i = 0; i <= array.length - 1; i += el) {
				System.out.print(array[i] + " ");
			}
		}


	}
}
