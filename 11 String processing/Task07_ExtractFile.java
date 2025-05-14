import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task07_ExtractFile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter file path: ");
		String[] filePath = sc.nextLine().split("\\\\");
		String fileName = filePath[filePath.length - 1];
		Pattern pattern = Pattern.compile("[a-z]{3,4}$");
		Matcher matcher = pattern.matcher(fileName);
		String name = "";
		String extension = "NaE";
		if(matcher.find()){
			name = matcher.group();
		} else {
			extension = matcher.group();
		}

		System.out.println("File name: " + fileName.substring(0, fileName.indexOf(name) - 1));
		System.out.println("File extension: " + name);
	}
}
/*
АКо използваме Regex: ([^\\\\]+)\\.([a-zA-Z0-9]+)$
можем да отделим името на файла и на разширенито в отделни групи, които да принтираме.
Но тъй като това е решение подпомогнато от ChatGPT, го оставям като коментар за
да чета повече.
Оставям оригиналното мое решение.
 */
