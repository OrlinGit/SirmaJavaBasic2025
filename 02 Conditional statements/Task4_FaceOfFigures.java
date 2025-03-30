import java.util.Scanner;

public class Task4_FaceOfFigures {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter type of figure:");
        String figure = sc.nextLine();
        double area = 0.0;
        switch (figure){
            case "square":
                System.out.println("Enter the side of the square a = ");
                double sideSquare = Double.parseDouble(sc.nextLine());
                area = Math.pow(sideSquare, 2);
                break;
            case "rectangle":
                System.out.println("Enter first side of the rectangle a = ");
                double sideARectangle = Double.parseDouble(sc.nextLine());
                System.out.println("Enter second side of the rectangle b = ");
                double sideBRectangle = Double.parseDouble(sc.nextLine());
                area = sideARectangle * sideBRectangle;
                break;
            case "circle":
                System.out.println("Enter radius of circle r = ");
                double radius = Double.parseDouble(sc.nextLine());
                area = Math.PI * Math.pow(radius, 2);
                break;
            case "triangle":
                System.out.println("Enter side of the triangle a = ");
                double sideTriangle = Double.parseDouble(sc.nextLine());
                System.out.println("Enter height of triangle h = ");
                double height = Double.parseDouble(sc.nextLine());
                area = (sideTriangle * height) / 2;
                break;
        }
        System.out.printf("%.2f", area);
    }
}
