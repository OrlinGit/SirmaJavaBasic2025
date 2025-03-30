import java.util.Scanner;

public class Task13_VegetableMarket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter type of vegetable:");
        String vegetable = sc.nextLine();
        System.out.println("Enter day of week:");
        String dayOfWeek = sc.nextLine();
        System.out.println("Enter quantity to purchase:");
        double quantity = Double.parseDouble(sc.nextLine());
        double price = 0.0;

        if (vegetable.equals("tomato")) {
            switch (dayOfWeek) {
                case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday":
                    price = 2.50;
                    break;
                case "Saturday", "Sunday":
                    price = 2.80;
                    break;
                default:
                    System.out.println("error");
            }
        } else if (vegetable.equals("onion")) {
            switch (dayOfWeek){
                case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday":
                    price = 1.20;
                    break;
                case "Saturday", "Sunday":
                    price = 1.30;
                    break;
                default:
                    System.out.println("error");
            }
        } else if (vegetable.equals("lettuce")) {
            /* тъй като цената не се променя през седмицата оставям тази switch структура
            само за да се провери деня от седмицата. Запазвам структурата непроменена с цел кода да е консистентен,
            и за да може лесно и удобно да се променя в бъдеще.
             */
            switch (dayOfWeek) {
                case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday":
                    price = 0.85;
                    break;
                case "Saturday", "Sunday":
                    price = 0.85;
                    break;
                default:
                    System.out.println("error");
            }
        } else if (vegetable.equals("cucumber")) {
            switch (dayOfWeek) {
                case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday":
                    price = 1.45;
                    break;
                case "Saturday", "Sunday":
                    price = 1.75;
                    break;
                default:
                    System.out.println("error");
            }
        } else if (vegetable.equals("pepper")) {
            switch (dayOfWeek){
                case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday":
                    price = 5.50;
                    break;
                case "Saturday", "Sunday":
                    price = 3.50;
                    break;
                default:
                    System.out.println("error");
            }
        } else {
            System.out.println("error");
        }
        double totalPrice = price * quantity;
        /*
        Тук извършвам проверка за финалната цена. Ако е нула, това означава, че деня на седмицата е грешен.
        В такъв случай освен "error" принтира и default-ната стойност на totalPrice.
        За да не се случва слагам проверка, която просто не минава през принтиране на стойност.

        Другия вариант е всеки default случай да приключва с return, което ще прекартява изпълнението на метода.
        Този вариант ще е и по удачен от гледна точка, че метода ще преключва веднага щом стигне до грешно зададен ден.
        Но тъй като все още не сме го изучавали и няма допълнителни изисквания приемам и този вариант на кода
        за валидно решение на задачата.
         */
        if (totalPrice != 0){
            System.out.printf("%.2f", totalPrice);
        } else{

        }
    }
}
