import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Task01_CountRealNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers:");
		String[] input = sc.nextLine().split(" ");
		Map<Double, Integer> map = new LinkedHashMap<>();
		int count = 1;
		/*
		Има готови функции, който директно проверяват и броят колко пъти се появява ключа.
		numberCounts.put(num, numberCounts.getOrDefault(num, 0) + 1);
		Аз не я използва с цел по-добро разбиране на работата на Map структорите.
		 */
		for (String element : input) {
			double number = Double.parseDouble(element);
			if (!map.containsKey(number)) {
				map.put(number, count);
			} else {
				int currentCount = map.get(number);
				currentCount++;
				map.put(number, currentCount);
			}
		}
		for(Map.Entry<Double, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
	}
}
