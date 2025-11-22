import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int exit = 0;

        while (exit != 1) {
            System.out.print("Введіть перше число: ");
            int a = scanner.nextInt();

            System.out.print("Введіть друге число: ");
            int b = scanner.nextInt();

            System.out.println("Результат множення: " + (a * b));

            System.out.print("Ввести 1 щоб завершити, інше число щоб продовжити: ");
            exit = scanner.nextInt();
        }

        System.out.println("Програма завершена.");
    }
}