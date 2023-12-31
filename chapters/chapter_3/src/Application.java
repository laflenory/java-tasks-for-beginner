import java.util.Scanner;
import java.text.MessageFormat;

public class Application {
    public static int max(int[] numbers) {
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }

        return max;
    }

    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);

        final int length = 3;
        int[] numbers = new int[length];

        String pattern = "Введите число под номером {0}: ";
        int number;

        for (int i = 0; i < length; i++) {
            System.out.print(MessageFormat.format(pattern, i + 1));
            number = scanner.nextInt();

            numbers[i] = number;
        }

        System.out.print("Максимальное число: ");
        System.out.println(max(numbers));
    }
}
