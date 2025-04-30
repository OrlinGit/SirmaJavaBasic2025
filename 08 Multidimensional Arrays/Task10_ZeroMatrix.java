import java.util.ArrayDeque;
import java.util.Scanner;

public class Task10_ZeroMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size ot matrix: ");
		String[] input = sc.nextLine().split(" ");
		int rows = Integer.parseInt(input[0]);
		int columns = Integer.parseInt(input[1]);
		int[][] matrix = fillMatrix(rows, columns);
		ArrayDeque<Integer> zeroes = getZeroes(matrix);
		int[][] finalMatrix = modifyMatrix(matrix, zeroes);
		printMatrix(finalMatrix);
	}
	public static void printMatrix(int[][] matrixToPrint){
		for (int i = 0; i < matrixToPrint.length; i++) {
			for (int j = 0; j < matrixToPrint[0].length; j++) {
				System.out.print(matrixToPrint[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static ArrayDeque<Integer> getZeroes(int[][] matrixToCheck){
		ArrayDeque<Integer> zerosInMatrix = new ArrayDeque<>();
		for (int i = 0; i < matrixToCheck.length; i++) {
			for (int j = 0; j < matrixToCheck[0].length; j++) {
				if(matrixToCheck[i][j] == 0){
					zerosInMatrix.offer(i);
					zerosInMatrix.offer(j);
				}
			}
		}
		return zerosInMatrix;
	}
	public static int[][] fillMatrix(int rows, int columns){
		Scanner sc = new Scanner(System.in);
		int[][] fullMatrix = new int[rows][columns];
		for (int i = 0; i < rows; i++) {
			System.out.println("Enter row " + (i + 1) + ":");
			String[] row = sc.nextLine().split(" ");
			for (int j = 0; j < columns; j++) {
				fullMatrix[i][j] = Integer.parseInt(row[j]);
			}

		}

		return fullMatrix;
	}
	public static int[][] modifyMatrix(int[][] matrix, ArrayDeque<Integer> zeroes){
		//int[][] modifiedMatrix = new int[matrix.length][matrix[0].length];
		while(!zeroes.isEmpty()){
			int row = zeroes.poll();
			int column = zeroes.poll();
			for (int i = 0; i < matrix[0].length; i++) {
				matrix[row][i] = 0;
			}
			for (int i = 0; i < matrix.length; i++) {
				matrix[i][column] = 0;
			}

		}

		return matrix;
	}
}
