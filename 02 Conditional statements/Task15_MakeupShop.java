import java.util.Scanner;

public class Task15_MakeupShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Входни данни, които четем от конзолата
        System.out.println("Enter price of renovation:");
        double renovation = Double.parseDouble(sc.nextLine());
        System.out.println("Enter count of powder:");
        int powderCount = Integer.parseInt(sc.nextLine());
        System.out.println("Enter count of lipstick:");
        int lipstickCount = Integer.parseInt(sc.nextLine());
        System.out.println("Enter count of spirals:");
        int spiralsCount = Integer.parseInt(sc.nextLine());
        System.out.println("Enter count of shadows:");
        int shadowsCount = Integer.parseInt(sc.nextLine());
        System.out.println("Enter count of correctors:");
        int correctorsCount = Integer.parseInt(sc.nextLine());
        /*
        Тук ще отделим цените в отделни променливи. Това ще подобри четимостта на кода за бъдеще и
        ще направи кода по-гъвкав в случай на бъдещи промени. И учи на дисциплина да не ме мързи да пиша код,
        а да го подреждам правилно.
         */
        double powderPrice = 2.60;
        double lipstickPrice = 3.0;
        double spiralPrice = 4.10;
        double shadowsPrice = 8.20;
        double correctorsPrice = 2.0;
        int countAllMakeup = powderCount + lipstickCount + spiralsCount + shadowsCount + correctorsCount;
        double amountBeforeDeduction = (powderPrice * powderCount) + (lipstickPrice * lipstickCount) +
                (spiralPrice * spiralsCount) + (shadowsPrice * shadowsCount) + (correctorsPrice * correctorsCount);
        // Ако са закупени повече от 50 артикула има 25% отстъпка.
        if (countAllMakeup >= 50){
            amountBeforeDeduction *= 0.75;
        }
        double finalAmount = amountBeforeDeduction * 0.90; //Махаме 10% наем.
        // Взимам абсолютна стойност за да мога да я използвам и в двата случая и да не правя още едно изчисление.
        double moneyLeft = Math.abs(finalAmount - renovation);
        if (finalAmount >= renovation){
            System.out.printf("Yes! %.2f lv left.", moneyLeft);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", moneyLeft);
        }
    }
}
