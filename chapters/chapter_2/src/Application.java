import java.util.Scanner;
import java.util.Arrays;

public class Application {
    public static boolean contains(char[] array, char element) {
        for (char item: array) {
            if (element == item) {
                return true;
            }
        }

        return false;
    }

    public static void main(String []args) {
        final char[] valid_operations = { '+', '-', '*', '/' };

        Scanner scanner = new Scanner(System.in);

        double first_number, second_number;
        char operation;

        System.out.print("Введите первое число: ");
        first_number = scanner.nextInt();

        System.out.print("Введите второе число: ");
        second_number = scanner.nextInt();

        System.out.print("Введите операцию (+, -, *, /): ");
        operation = scanner.next().charAt(0);

        if (contains(valid_operations, operation)) {
            System.out.print("Ответ: ");

            switch (operation) {
                case '+' -> System.out.println(first_number + second_number);
                case '-' -> System.out.println(first_number - second_number);
                case '*' -> System.out.println(first_number * second_number);
                case '/' -> System.out.println(first_number / second_number);
            }
        } else {
            System.out.println("Введена недопустимая операция.");
        }
    }
}
