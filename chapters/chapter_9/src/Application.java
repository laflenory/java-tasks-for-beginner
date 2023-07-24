import java.util.Scanner;

public class Application {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        int flag = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                flag += 1;
            }
        }

        if (flag < 2 && number > 1) {
            System.out.println("Число является простым.");
        } else {
            System.out.println("Число не является простым.");
        }
    }
}
