import java.util.Scanner;

public class Task02_MatrixAddition {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		System.out.println("Enter dimensions of each matrix:");
		String[] input = sc.nextLine().split(" ");
		/*правя ги с отделни редове, защото функцията createMatrix създава матрицата и
		веднага ги пълни с елементи. Ако създавам двете матрици наведнъж, те ще бъдат винаги еднакви.
		 */
		System.out.println("Enter data for first matrix:");
		int[][] matrixOne = createMatrix(input);
		System.out.println("Enter data for second matrix:");
		int[][] matrixTwo = createMatrix(input);
		int[][] resultMatrix = sumOfTwoMatrices(matrixOne, matrixTwo);
		for (int i = 0; i < resultMatrix.length; i++) {
			for (int j = 0; j < resultMatrix[0].length; j++) {
				System.out.print(resultMatrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static int[][] createMatrix(String[] input){
		Scanner sc = new Scanner(System.in);
		int rows = Integer.parseInt(input[0]);
		int columns = Integer.parseInt(input[1]);
		int[][] matrix = new int[rows][columns];
		for (int i = 0; i < rows; i++) {
			System.out.println("Enter elements of row " + i);
			String[] inputData = sc.nextLine().split(" ");
			for (int j = 0; j < columns; j++) {
				matrix[i][j] = Integer.parseInt(inputData[j]);
			}
		}
		return matrix;
	}
	public static int[][] sumOfTwoMatrices(int[][] firstMatrix, int[][] secondMatrix){
		int[][] sumMatrix = new int[firstMatrix.length][firstMatrix[0].length];
		for (int i = 0; i < firstMatrix.length; i++) {
			for (int j = 0; j < firstMatrix[0].length; j++) {
				sumMatrix[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
			}
		}
		return sumMatrix;
	}
}
