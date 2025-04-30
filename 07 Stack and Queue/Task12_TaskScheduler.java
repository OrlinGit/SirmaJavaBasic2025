import java.util.PriorityQueue;
import java.util.Scanner;

public class Task12_TaskScheduler {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter task: ");
		String input = sc.nextLine();
		PriorityQueue<Task> taskQueue = new PriorityQueue<>(
				(a,b) -> {
					if (a.priority == b.priority){
						return  0;
					}
					if (a.priority > b.priority){
						return  -1;
					} else {
						return  1;
					}
				}
		);
		while(!input.equals("getNextTask")){
			String[] commands = input.split(" ");
			taskQueue.add(new Task(commands[1], Integer.parseInt(commands[2])));
			System.out.println("Enter task: ");
			input = sc.nextLine();
		}

		Task taskHighPriority = taskQueue.poll();
		System.out.println(taskHighPriority.task + " - " + taskHighPriority.priority);
	}
}
