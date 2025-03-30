import java.util.Arrays;
import java.util.Scanner;

public class Task01_CompareMatrices {
	public static void main(String[] args) {
		//Входа може да се опрости още като се изкара част от нбего в отделна функция
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter dimensions of first matrix:");
		String[] firstMatrixSize = sc.nextLine().split(" ");
		int rows1 = Integer.parseInt(firstMatrixSize[0]);
		int columns1 = Integer.parseInt(firstMatrixSize[1]);
		int[][] firstMatrix = setMatrix(rows1, columns1);
		System.out.println("Enter dimensions of second matrix:");
		String[] secondMatrixSize = sc.nextLine().split(" ");
		int rows2 = Integer.parseInt(secondMatrixSize[0]);
		int columns2 = Integer.parseInt(secondMatrixSize[1]);
		int[][] secondMatrix = setMatrix(rows2, columns2);
		boolean result = areEqual(firstMatrix, secondMatrix);
		if(result){
			System.out.println("equal");
		} else {
			System.out.println("not equal");
		}
	}

	public static int[][] setMatrix(int rows, int columns) {
		Scanner sc = new Scanner(System.in);
		int[][] fullMatrix = new int[rows][columns];
		for (int i = 0; i < rows; i++) {
			System.out.println("Enter elements of row " + (i+1));
			String[] elementsOfColumn = sc.nextLine().split(" ");
			int[] elementsOfColumnInt = Arrays.stream(elementsOfColumn)
					.mapToInt(Integer::parseInt)
					.toArray();
			for (int j = 0; j < columns; j++) {
				fullMatrix[i][j] = elementsOfColumnInt[j];
			}
		}
		return fullMatrix;
	}

	public static boolean areEqual(int[][] matrixOne, int[][] matrixTwo) {
		boolean isTrue;
		if (matrixOne.length != matrixTwo.length) {
			return false;
		} else {
			for (int rows = 0; rows < matrixOne.length; rows++) {
				for (int columns = 0; columns < matrixOne[0].length; columns++) {
					if(matrixOne[rows][columns] != matrixTwo[rows][columns]){
						return false;
					}
				}
			}
		}
		return true;
	}
}
