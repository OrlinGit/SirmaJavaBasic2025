public class Task07_Clock {
    public static void main(String[] args) {
        for (int i = 0; i <= 23; i++) {
            for (int j = 0; j <= 59; j++) {
                System.out.printf("%02d:%02d%n", i, j);
            }
        }
    }
}
