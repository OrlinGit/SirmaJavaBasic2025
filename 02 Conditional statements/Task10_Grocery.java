import java.util.Scanner;

public class Task10_Grocery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product:");
        String product = sc.nextLine();
        System.out.println("Enter city:");
        String city = sc.nextLine();
        System.out.println("Enter quantity:");
        int quantity = Integer.parseInt(sc.nextLine());
        double price = 0.0;
        if (city.equals("Sofia")){
            switch (product){
                case "tea":
                    price = 0.50;
                    break;
                case "water":
                    price = 0.80;
                    break;
                case "juice":
                    price = 1.20;
                    break;
                case "sweets":
                    price = 1.45;
                    break;
                case "chips":
                    price = 1.60;
                    break;
            }
        } else if (city.equals("Plovdiv")) {
            switch (product){
                case "tea":
                    price = 0.40;
                    break;
                case "water":
                    price = 0.70;
                    break;
                case "juice":
                    price = 1.15;
                    break;
                case "sweets":
                    price = 1.30;
                    break;
                case "chips":
                    price = 1.50;
                    break;
            }
        } else if (city.equals("Varna")) {
            switch (product){
                case "tea":
                    price = 0.45;
                    break;
                case "water":
                    price = 0.70;
                    break;
                case "juice":
                    price = 1.10;
                    break;
                case "sweets":
                    price = 1.35;
                    break;
                case "chips":
                    price = 1.55;
                    break;
            }
        }
        System.out.printf("%.2f", (quantity * price));
    }
}
