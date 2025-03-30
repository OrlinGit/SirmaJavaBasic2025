import java.util.Scanner;

public class Task16_AtSea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many days will be the stay:");
        int days = Integer.parseInt(sc.nextLine());
        System.out.println("Enter the type pf room:");
        String typeOfRoom = sc.nextLine();
        System.out.println("Enter assessment:");
        String assessment = sc.nextLine();
        double singleRoomPrice = 25.00;
        double apartmentPrice = 50.00;
        double presidentialPrice = 100.00;
        double priceAfterDiscount = 0.0;
        double finalPrice = 0.0;

        if (days < 10){
            switch (typeOfRoom){
                case "single room":
                    priceAfterDiscount = (days -1) * singleRoomPrice;
                    break;
                case "apartment":
                    priceAfterDiscount = (days - 1) * apartmentPrice * 0.70;
                    break;
                case "presidential":
                    priceAfterDiscount = (days -1) * presidentialPrice * 0.90;
                    break;
            }
        } else if (days <= 15) {
            switch (typeOfRoom){
                case "single room":
                    priceAfterDiscount = (days -1) * singleRoomPrice;
                    break;
                case "apartment":
                    priceAfterDiscount = (days - 1) * apartmentPrice * 0.65;
                    break;
                case "presidential":
                    priceAfterDiscount = (days -1) * presidentialPrice * 0.85;
                    break;
            }
        } else if (days > 15) {
            switch (typeOfRoom) {
                case "single room":
                    priceAfterDiscount = (days - 1) * singleRoomPrice;
                    break;
                case "apartment":
                    priceAfterDiscount = (days - 1) * apartmentPrice * 0.50;
                    break;
                case "presidential":
                    priceAfterDiscount = (days - 1) * presidentialPrice * 0.80;
                    break;
            }
        }
        if (assessment.equals("positive")){
            finalPrice = priceAfterDiscount * 1.25;
        } else if (assessment.equals("negative")) {
            finalPrice = priceAfterDiscount * 0.90;
        }
        System.out.printf("%.2f", finalPrice);
    }
}
