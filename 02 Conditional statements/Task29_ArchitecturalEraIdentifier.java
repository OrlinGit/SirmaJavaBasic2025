import java.util.Scanner;

public class Task29_ArchitecturalEraIdentifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year:");
        int year = Integer.parseInt(sc.nextLine());
        System.out.println("Enter material:");
        String material = sc.nextLine();
        String era = "";
        if (material.equals("stone")){
            if (year < 500){
                era = "Ancient";
            } else if (500 <= year && year <= 1500) {
                era = "Medieval";
            } else {
                era = "Uncertain";
            }
        } else if (material.equals("wood")) {
            if (1500 <= year && year <= 1800){
                era = "Colonial";
            } else {
                era = "Uncertain";
            }
        } else if (material.equals("steel")) {
            if (1800 <= year && year <= 1900){
                era = "Industrial";
            } else if (year > 1900) {
                era = "Modern";
            } else {
                era = "Uncertain";
            }
        }
        System.out.println(era);
    }
}
