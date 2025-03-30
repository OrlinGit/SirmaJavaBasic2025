import java.util.Scanner;
import  java.util.Arrays;

public class Task02_DayOfWeek {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter day of week:");
		int day = Integer.parseInt(sc.nextLine());

		String[] week = {
				"Monday",
				"Tuesday",
				"Wednesday",
				"Thursday",
				"Friday",
				"Saturday",
				"Sunday"
		};
		if(0 > day || day > week.length - 1){
			System.out.println("Invalid day!");
		}else{
			System.out.println(week[day - 1]);
		}
	}
}
