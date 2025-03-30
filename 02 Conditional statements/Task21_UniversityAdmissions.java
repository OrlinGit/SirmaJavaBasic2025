import java.util.Scanner;

public class Task21_UniversityAdmissions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter score");
        int score = Integer.parseInt(sc.nextLine());
        System.out.println("Enter number of extracurriculars:");
        int extracurriculars = Integer.parseInt(sc.nextLine());
        String output = "";
        if (score < 80){
            output = "Not admitted";
        } else if (score <= 89) {
            if (extracurriculars >= 2){
                output = "Admitted";
            } else {
                output = "Not admitted";
            }
// Може и само с else да се напише, но така според мен има по-добра четимост заради визуализация на граничната стойност
        } else if (score >= 90) {
            output = "Admitted";
        }
        System.out.println(output);
    }
}
