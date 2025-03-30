import java.util.Arrays;
import java.util.Scanner;

public class Task05_MaximumSumOf2X2Submatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements of matrix:");
		String[] elements = sc.nextLine().split(" ");
		int rows = Integer.parseInt(elements[0]);
		int columns = Integer.parseInt(elements[1]);
		int[][] matrix = new int[rows][columns];
		for (int i = 0; i < rows; i++) {
			System.out.println("Enter elements of row: " + (i + 1));
			String[] rowData = sc.nextLine().split(" ");
			int[] rowDataInt = Arrays.stream(rowData)
					.mapToInt(Integer::parseInt)
					.toArray();
			for (int j = 0; j < columns; j++) {
				matrix[i][j] = rowDataInt[j];
			}

		}

		int[] result = sumOfSubMatrix(matrix);
		int sum = result[0];
		int indexRow = result[1];
		int indexColumn = result[2];
		System.out.println(sum);
		for (int i = indexRow; i <= indexRow +1; i++) {
			for (int j = indexColumn; j <= indexColumn + 1; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static int[] sumOfSubMatrix(int matrixInput[][]) {
		int[] result = new int[3];
		int sum = Integer.MIN_VALUE;
		int startRow = 0;
		int startColumn = 0;
		for (int i = 0; i < matrixInput.length - 1; i++) {
			for (int j = 0; j < matrixInput[0].length - 1; j++) {
				int currentSum = 0;
				currentSum += matrixInput[i][j] + matrixInput[i][j + 1] + matrixInput[i + 1][j] + matrixInput[i + 1][j + 1];
				if (currentSum > sum) {
					sum = currentSum;
					startRow = i;
					startColumn = j;
				}
			}
			result[0] = sum;
			result[1] = startRow;
			result[2] = startColumn;
		}
		return result;
	}
}
