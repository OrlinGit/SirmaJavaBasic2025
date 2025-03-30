import  java.util.Scanner;

public class WeatherForecast {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter town name:");
        String town = sc.nextLine();

        System.out.println("Enter degrees:");
        int temperaturte = Integer.parseInt(sc.nextLine());

        System.out.printf("Today in %s it is %d degrees.", town, temperaturte);

    }
}
