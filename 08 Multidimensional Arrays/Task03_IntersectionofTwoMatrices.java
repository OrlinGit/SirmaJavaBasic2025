import java.util.Scanner;

public class Task03_IntersectionofTwoMatrices {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows:");
		int rows = Integer.parseInt(sc.nextLine());
		System.out.println("Enter number of columns:");
		int columns = Integer.parseInt(sc.nextLine());
		System.out.println("Enter characters for first matrix:");
		char[][] matrixOne = createMatrix(rows, columns);
		System.out.println("Enter characters for second matrix:");
		char[][] matrixTwo = createMatrix(rows, columns);
		/*
		Финалната матрица може да се принтира още във функцията intersectedMatrix
		но предпочитам да я изкарам в отделна променлива, която в псоледствие да се манипулира според нуждите.
		 */
		char[][] finalMatrix = intersectedMatrix(matrixOne, matrixTwo);
		for (int i = 0; i < finalMatrix.length; i++) {
			for (int j = 0; j < finalMatrix[0].length; j++) {
				System.out.print(finalMatrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static char[][] createMatrix(int rows, int columns) {
		char[][] matrix = new char[rows][columns];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < rows; i++) {
			System.out.println("Enter elements of row " + i);
			String[] inputData = sc.nextLine().split(" ");
			for (int j = 0; j < columns; j++) {
				matrix[i][j] = inputData[j].charAt(0);
			}
		}
		return matrix;
	}

	public static char[][] intersectedMatrix(char[][] firstMatrix, char[][] secondMatrix) {
		char[][] intersectedMatrix = new char[firstMatrix.length][firstMatrix[0].length];
		for (int i = 0; i < firstMatrix.length; i++) {
			for (int j = 0; j < firstMatrix[0].length; j++) {
				if (firstMatrix[i][j] == secondMatrix[i][j]) {
					intersectedMatrix[i][j] = firstMatrix[i][j];
				} else {
					intersectedMatrix[i][j] = '*';
				}
			}
		}
		return intersectedMatrix;
	}
}
