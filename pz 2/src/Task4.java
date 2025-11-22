import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введіть число: ");
            int n = scanner.nextInt();

            int sum = 0;

            for (int i = 1; i <= n; i++) {
                sum += i;
            }

            System.out.println("Сума чисел від 1 до " + n + " = " + sum);     
        }
    }
}