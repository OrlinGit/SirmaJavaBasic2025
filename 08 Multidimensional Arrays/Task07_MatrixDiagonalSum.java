import java.util.Scanner;

public class Task07_MatrixDiagonalSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of matrix:");
		int size = Integer.parseInt(sc.nextLine());
		int[][] matrix = inputMatrix(size);
		System.out.println(sumOfDiagonals(matrix));
	}
	public static int[][] inputMatrix(int size){
		Scanner sc = new Scanner(System.in);
		int[][] matrix = new int[size][size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter data for row "+ (i+1));
			String[] input = sc.nextLine().split(" ");
			for (int j = 0; j < size; j++) {
				matrix[i][j] = Integer.parseInt(input[j]);
			}
		}
		return matrix;
	}
	public static int sumOfDiagonals(int[][] fullMatrix){
		int sum = 0;
		//Изнасям дълфината на масива в отделна променлива за подобра четимост.
		int length = fullMatrix.length;
		//Тук добавям към сумата елементите от първия диагонал
		for (int i = 0; i < length; i++) {
			sum += fullMatrix[i][i];
		}
		//Тук добавям към сумата елементите от втория диагонал
		for (int i = 0; i < length; i++) {
			sum += fullMatrix[(length - 1) - i][i];
		}
		return sum;
	}
}
