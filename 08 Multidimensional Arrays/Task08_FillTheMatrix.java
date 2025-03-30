import java.util.Scanner;

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter size and method:");
	String[] input = sc.nextLine().split(" ");
	int sizeOfMatrix = Integer.parseInt(input[0]);
	String method = input[1];
	int[][] fullMatrix = methodB(sizeOfMatrix);
	for (int i = 0; i < fullMatrix.length; i++) {
		for (int j = 0; j < fullMatrix[0].length; j++) {
			System.out.print(fullMatrix[i][j] + " ");
		}
		System.out.println();
	}

}
public static int[][] methodA(int size){
	int[][] matrix = new int[size][size];
	int counter = 0;
	for (int i = 0; i < size; i++) {
		for (int j = 0; j < size ; j++) {
			counter++;
			matrix[j][i] = counter;
		}
	}
	return matrix;
}
public static int[][] methodB(int size){
	int[][] matrix = new int[size][size];
	int counter = 0;
	for (int i = 0; i < size; i++) {
		if(i % 2 == 0){
			for (int j = 0; j < size; j++) {
				matrix[j][i] = ++counter;
			}
		}
		if (i % 2 != 0) {
			for (int j = size - 1; j >= 0; j--) {
				matrix[j][i] = ++counter;
			}
		}
	}
	return  matrix;
}
