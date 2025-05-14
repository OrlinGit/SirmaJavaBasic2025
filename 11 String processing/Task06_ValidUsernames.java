import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task06_ValidUsernames {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		System.out.println("Enter usernames: ");
		String[] input = sc.nextLine().split(", ");
		Pattern pattern = Pattern.compile("^[a-zA-Z-_0-9]{3,16}$");
		for (String username : input) {
			Matcher matcher = pattern.matcher(username);
			if(matcher.find()) {
				System.out.println(username);
			}
		}
	}
}
