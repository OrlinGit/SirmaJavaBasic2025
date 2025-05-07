import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task14_StudentAcademy {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, ArrayList<Double>> allGradesRecord = new HashMap<>();
		Map<String, Double> averageGrades = new HashMap<>();
		System.out.println("Enter number of rows: ");
		int rows = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < rows; i++) {
			System.out.println("Enter name: ");
			String name = sc.nextLine();
			System.out.println("Enter grade: ");
			Double grade = Double.parseDouble(sc.nextLine());
			if(allGradesRecord.containsKey(name)){
			ArrayList<Double> currentGrades = allGradesRecord.get(name);
			currentGrades.add(grade);
			allGradesRecord.put(name, currentGrades);
			} else {
				ArrayList<Double> currentGrades = new ArrayList<>();
				currentGrades.add(grade);
				allGradesRecord.put(name, currentGrades);
			}
		}

		for(Map.Entry<String, ArrayList<Double>> entry : allGradesRecord.entrySet()){
			String name = entry.getKey();
			ArrayList<Double> studentsGrades = entry.getValue();
			Double averageGrade = calculateAverage(studentsGrades);
			if (averageGrade >= 4.50){
				averageGrades.put(name, averageGrade);
			}
		}

		printAverageGrades(averageGrades);
	}
	public static Double calculateAverage(ArrayList<Double> allGrades){
		Double sumGrades = 0.0;
		for (int i = 0; i < allGrades.size(); i++) {
			sumGrades += allGrades.get(i);
		}
		return sumGrades / allGrades.size();
	}
	public static void printAverageGrades(Map<String, Double> gradesToPrint){
		for (Map.Entry<String, Double> entry : gradesToPrint.entrySet()){
			System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue());
		}
	}
}
