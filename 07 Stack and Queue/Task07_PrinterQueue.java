import java.util.ArrayDeque;
import java.util.Scanner;

public class Task07_PrinterQueue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter document to be printed:");
		String input = sc.nextLine();
		ArrayDeque<String> printerQueue = new ArrayDeque<>();
		while(!input.equals("print")){
			if(input.equals("cancel")){
				printerQueue.poll();
			}else {
				printerQueue.offer(input);
			}
			System.out.println("Enter document to be printed:");
			input = sc.nextLine();
		}
		if(printerQueue.isEmpty()){
			System.out.println("Standby");
		} else {
			for (String element : printerQueue){
				System.out.println(printerQueue.pollFirst());
			}
		}

	}
}
