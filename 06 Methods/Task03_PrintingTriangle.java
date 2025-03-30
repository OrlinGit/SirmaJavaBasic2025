import java.util.Scanner;

public class Task03_PrintingTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input high of triangle:");
		int highOfTriangle = Integer.parseInt(sc.nextLine());
		printTriangle(highOfTriangle);
	}
	public static void printTriangle(int inputHighOfTriangle){
		for (int i = 1; i <= inputHighOfTriangle; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		for (int i = inputHighOfTriangle - 1; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
