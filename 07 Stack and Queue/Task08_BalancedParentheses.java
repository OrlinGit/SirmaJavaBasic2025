import java.util.ArrayDeque;
import java.util.Scanner;

public class Task08_BalancedParentheses {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string:");
		String[] input = sc.nextLine().split("");
		boolean result = isBalanced(input);
		if(result == true){
			System.out.println("True");
		} else {
			System.out.println("False");
		}

	}
	public static boolean isBalanced(String[] inputString){
		ArrayDeque<String> stack = new ArrayDeque<>();
		for(String element : inputString){
			if(element.equals("{") || element.equals("[") || element.equals("(")){
				stack.push(element);
			} else if (element.equals("}") || element.equals("]") || element.equals(")")) {
				if(stack.isEmpty()){
					return false;
				}else{
					String openingBracket = stack.pop();
					if(!isMatching(openingBracket, element)){
						return false;
					}
				}
			}
		}
			return stack.isEmpty();
	}
	public static boolean isMatching(String open, String close){
		/* Могат всички проверки да се включат в един if отделени със () и || проверка,
		но ще стане прекалено дълъг израз затова ги правя в отделни else if проверки.
		 */
		if(open.equals("{") && close.equals("}")){
		return true;
		} else if (open.equals("[") && close.equals("]")) {
			return true;
		} else if (open.equals("(") && close.equals(")")) {
			return  true;
		}
		return false;
	}
}
