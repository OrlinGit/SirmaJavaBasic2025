import java.util.Scanner;

public class Task02_Grades {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter grade:");
		double grade = Double.parseDouble(sc.nextLine());
		gradeInWords(grade);
	}
	public static void gradeInWords(double inputGrade){
		if(inputGrade >= 2.00 && inputGrade <= 2.99){
			System.out.println("Fail");
		} else if (inputGrade <= 3.49) {
			System.out.println("Poor");
		} else if (inputGrade <= 4.49) {
			System.out.println("Good");
		} else if (inputGrade <= 5.49) {
			System.out.println("Very good");
		} else if (inputGrade <= 6.00) {
			System.out.println("Excellent");
		}
	}
}
