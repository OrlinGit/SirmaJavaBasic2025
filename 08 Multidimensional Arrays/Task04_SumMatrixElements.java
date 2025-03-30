import java.util.Arrays;
import java.util.Scanner;

public class Task04_SumMatrixElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements of matrix:");
		String[] elements = sc.nextLine().split(", ");
		int rows = Integer.parseInt(elements[0]);
		int columns = Integer.parseInt(elements[1]);
		int[][] matrix = new int[rows][columns];
		for (int i = 0; i < rows; i++) {
			System.out.println("Enter elements of row: " + (i + 1));
			String[] rowData = sc.nextLine().split(", ");
			int[] rowDataInt = Arrays.stream(rowData)
					.mapToInt(Integer::parseInt)
					.toArray();
			for (int j = 0; j < columns; j++) {
				matrix[i][j] = rowDataInt[j];
			}

		}
		System.out.println(matrix.length);
		System.out.println(matrix[0].length);
		System.out.println(sumOfMatrix(matrix));

	}
	public static int sumOfMatrix(int matrixInput[][]){
		int sum = 0;
		for (int i = 0; i < matrixInput.length; i++) {
			for (int j = 0; j < matrixInput[0].length; j++) {
				sum += matrixInput[i][j];
			}
		}
		return sum;
	}
}
