import java.util.Scanner;

public class Application {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Заданное число является чётным.");
        } else {
            System.out.println("Заданное число является нечётным.");
        }
    }
}
