import java.util.Scanner;

public class Task06_CalculateRectangleArea {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		System.out.println("Enter side a= :");
		int firstSide = Integer.parseInt(sc.nextLine());
		System.out.println("Enter side b= :");
		int secondSide = Integer.parseInt(sc.nextLine());
		int area = calculateRectangleArea(firstSide, secondSide);
		System.out.println(area);
	}

	private static int calculateRectangleArea(int firstSideInput, int secondSideInput) {
		return  firstSideInput * secondSideInput;
	}
}
