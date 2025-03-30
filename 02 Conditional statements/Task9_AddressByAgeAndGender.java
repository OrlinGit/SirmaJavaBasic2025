import java.util.Scanner;

public class Task9_AddressByAgeAndGender {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age:");
        double age = Double.parseDouble(sc.nextLine());
        System.out.println("Enter character for gender:");
        char gender = sc.nextLine().charAt(0);
        String address = "";
        if (gender == 'm'){
            if (age < 16){
                address = "Master";
            }else {
                address = "Mr.";
            }
        } else if (gender == 'f') {
            if (age < 16){
                address = "Miss";
            }else{
                address = "Ms.";
            }
        }
        System.out.println(address);
    }
}
