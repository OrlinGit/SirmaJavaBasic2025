import java.util.Scanner;

public class Task28_ClimateZoneIdentifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter latitude:");
        Double latitude = Double.parseDouble(sc.nextLine());
        System.out.println("Enter hemisphere:");
        char hemisphere = sc.next().charAt(0);
        String climateZone = "";
        if (latitude == 0){
            climateZone = "Equator";
        } else if ((-23.5 < latitude && latitude <= 23.5) && latitude != 0) {
            climateZone = "Tropic Zone";
            /*
            if (hemisphere == 'N'){
                climateZone += " Northern Hemisphere";
            } else if (hemisphere == 'S') {
                climateZone += " Southern Hemisphere";
            }
             */
        } else if ((23.5 < latitude && latitude <= 66.5) || (-23.5 > latitude && latitude >= -66.5)) {
            climateZone = "Temperate Zone";
            /*
            if (hemisphere == 'N'){
                climateZone += " Northern Hemisphere";
            } else if (hemisphere == 'S') {
                climateZone += " Southern Hemisphere";
            }
             */
        } else if ((latitude > 66.5) || (latitude < -66.5)) {
            climateZone = "Arctic Zone";
            /*
            if (hemisphere == 'N'){
                climateZone += " Northern Hemisphere";
            } else if (hemisphere == 'S') {
                climateZone += " Southern Hemisphere";
            }
             */
        }
        System.out.println(climateZone);
    }
}
