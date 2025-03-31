import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Task02_AverageStudentsGrades {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of entries:");
		int numberOfEntries = Integer.parseInt(sc.nextLine());
		Map<String, ArrayList<Double>> studentGrades = new TreeMap<String, ArrayList<Double>>();
		for (int i = 0; i < numberOfEntries; i++) {
			System.out.println("Enter name and grade:");
			String[] input = sc.nextLine().split(" ");
			String name = input[0];
			Double grade = Double.parseDouble(input[1]);
			studentGrades.putIfAbsent(name, new ArrayList<>());
			studentGrades.get(name).add(grade);

		}
		for (Entry element : studentGrades.entrySet()) {
			ArrayList<Double> gradesOfStudent = (ArrayList<Double>) element.getValue();
			double average = 0.0;
			double sum = 0.0;
			for(double grade : gradesOfStudent){
				sum += grade;
				average = sum / gradesOfStudent.size();
			}
			System.out.print(element.getKey() + " -> " + element.getValue());
			System.out.printf(" (avg: %.2f)%n", average);
		}
		/* За принтиране на нов ред в момента използвам темплейт %n.
		Но го правя само за учебни цели. Тъй като тази команда е зависима от системата на която работи програмата.
		За да е независима от OS бих използвал друг метод, например:
		System.out.println();
		 */
	}
}
