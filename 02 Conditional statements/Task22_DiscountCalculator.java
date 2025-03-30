/*
Тъй като не се извършват проверки за входа си позволявам да напиша възрастовите групи - под 18
и над 65 без if-else проверка за карта за отстъпка
 */
import java.util.Scanner;

public class Task22_DiscountCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input age:");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Does teh customer have membership card:");
        String card = sc.nextLine();
        String discount = "";
        if (age < 18){
            discount = "10% discount";
        } else if ( age <= 64) {
            if (card.equals("Yes")){
                discount = "20% discount";
            } else if (card.equals("No")) {
                discount = "10% discount";
            }
        } else if (age >= 65) {
            discount = "30% discount";
        }
        System.out.println(discount);
    }
}
