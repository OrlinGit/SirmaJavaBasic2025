import java.util.ArrayDeque;
import java.util.Scanner;
public class Task09_RowSumAndColumnSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter dimensions of matrix:");
		String[] input = sc.nextLine().split(" ");
		int rows = Integer.parseInt(input[0]);
		int columns = Integer.parseInt(input[1]);
		int[][] matrix = fillMatrix(rows, columns);
		sumsOfMatrix(matrix);
	}



public static int[][] fillMatrix(int rows, int columns) {
	int[][] fullMatrix = new int[rows][columns];
	int counter = 0;
	for (int i = 0; i < rows; i++) {
		for (int j = 0; j < columns; j++) {
			fullMatrix[i][j] = ++counter;
		}
	}
	return fullMatrix;
}

public static void sumsOfMatrix(int[][] fullMatrix) {
	ArrayDeque<Integer> rowsQueue = new ArrayDeque<>();
	ArrayDeque<Integer> columnsQueue = new ArrayDeque<>();
	int sumRows = 0;
	int sumColumns = 0;
	for (int i = 0; i < fullMatrix.length; i++) {
		for (int j = 0; j < i; j++) {
			sumRows += fullMatrix[i][j];
		}
		rowsQueue.add(sumRows);
	}

	for (int i = 0; i < fullMatrix[0].length; i++) {
		for (int j = 0; j < fullMatrix[0].length; j++) {
			sumColumns += fullMatrix[j][i];
		}
		columnsQueue.add(sumColumns);
	}

	for (int i = 0; i < rowsQueue.size(); i++) {
		System.out.print("Row sums: ");
		System.out.println(rowsQueue.poll() + ",");
	}

	for (int i = 0; i < columnsQueue.size(); i++) {
		System.out.print("Column sums: ");
		System.out.print(columnsQueue.poll() + ",");
	}
}
}

