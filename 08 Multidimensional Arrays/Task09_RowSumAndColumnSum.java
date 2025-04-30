import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

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
		for (int i = 0; i < fullMatrix.length; i++) {
			int sumRows = 0;
			for (int j = 0; j < fullMatrix[0].length; j++) {
				sumRows += fullMatrix[i][j];
			}
			rowsQueue.add(sumRows);
		}

		for (int i = 0; i < fullMatrix[0].length; i++) {
			int sumColumns = 0;
			for (int j = 0; j < fullMatrix.length; j++) {
				sumColumns += fullMatrix[j][i];
			}
			columnsQueue.add(sumColumns);
		}
		ArrayList<Integer> row = new ArrayList<>();
		System.out.print("Row sums: ");
		for (int i = 0; i < fullMatrix.length; i++) {
			row.add(Integer.valueOf(Integer.toString(rowsQueue.poll())));
		}
		String resultRows = row.stream()
				.map(String::valueOf)
				.collect(Collectors.joining(","));
		System.out.println(resultRows);

		ArrayList<Integer> columns = new ArrayList<>();
		System.out.print("Column sums: ");
		for (int i = 0; i < fullMatrix[0].length; i++) {
			columns.add(columnsQueue.poll());
		}
		String resultColumns = columns.stream()
				.map(String::valueOf)
				.collect(Collectors.joining(","));
		System.out.println(resultColumns);
	}
}

