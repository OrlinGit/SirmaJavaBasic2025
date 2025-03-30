import java.util.Scanner;

public class Task24_AirlineLuggageCharges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter weight");
        int weight = Integer.parseInt(sc.nextLine());
        System.out.println("Enter dimension:");
        int dimension = Integer.parseInt(sc.nextLine());
        int fee = 0;
        String output = "";
        if (weight > 50){
            fee += 100;
            if (output.isEmpty()){
                output += "Overweight";
            } else{
                output += " + Overweight";
            }
        }
        if (dimension > 158){
            if ((dimension - 158) <= 20){
                fee += 50;
                if (output.isEmpty()){
                    output += "Slightly oversize";
                } else{
                    output += " + Slightly oversize";
                }
            } else if ((dimension - 158) <= 50) {
                fee += 100;
                if (output.isEmpty()){
                    output += "Oversize";
                } else{
                    output += " + Oversize";
                }
            } else if ((dimension - 158) > 50) {
                fee += 200;
                if (output.isEmpty()){
                    output += "Very oversize";
                } else{
                    output += " + Very oversize";
                }
            }
            /* задавам dimension 208 тъй като според мен има в условието изпуснато уточнение.
            На база предположение от входните данни предполагам, че важи само за случаи,
            в които размера надхвърля с 50 см допустимия
            */
        }if(weight > 50 && dimension > 208){
            fee += 50;
            output += " + Handling";
        }
        System.out.printf("%d (%s)", fee, output);
    }
}
