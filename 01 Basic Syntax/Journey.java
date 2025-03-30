import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter speed of first car:");
        int speedFirstCar = Integer.parseInt(sc.nextLine());
        System.out.println("Enter speed of second car:");
        int speedSecondCar = Integer.parseInt(sc.nextLine());

        int time = 3; // this is the time after departure of second car
        int distanceFirstCar = speedFirstCar * (time + 2);
        int distanceSecondCar = speedSecondCar * time;
        int distanceBetweenTwoCars = distanceFirstCar - distanceSecondCar;
        System.out.println(distanceBetweenTwoCars);
    }
}
