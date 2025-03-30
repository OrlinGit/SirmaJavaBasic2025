import java.util.Scanner;

public class Task06_DiagonalsOfSquareMatrix {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of matrix:");
		int size = Integer.parseInt(sc.nextLine());
		int [][] matrix = inputMatrix(size);
		for (int i = 0; i < size; i++) {
			System.out.print(matrix[i][i] + " ");
		}
		System.out.println();
		for (int i = 0; i < size; i++) {
			System.out.print(matrix[(size -1) - i][i] + " ");
		}

	}
	public static int[][] inputMatrix(int size){
		Scanner sc = new Scanner(System.in);
		int[][] matrix = new int[size][size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter element of row " + (i + 1));
			String[] input = sc.nextLine().split(" ");
			for (int j = 0; j < size; j++) {
				matrix[i][j] = Integer.parseInt(input[j]);
			}
		}
		return matrix;
	}

}
