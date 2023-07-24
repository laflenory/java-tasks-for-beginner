import java.util.Arrays;
import java.util.Scanner;
import java.text.MessageFormat;

public class Application {
    public static int min(int[] numbers, int length) {
        int min = numbers[0];

        for (int i = 1; i < length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }

        return min;
    }

    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        final int length = scanner.nextInt();
        int[] numbers = new int[length];

        String pattern = "Введите число под номером {0}: ";

        for (int i = 0; i < length; i++) {
            System.out.print(MessageFormat.format(pattern, i + 1));
            int number = scanner.nextInt();

            numbers[i] = number;
        }

        System.out.println("Полученный массив: " + Arrays.toString(numbers));
        System.out.println("Минимальное число массива: " + min(numbers, length));
    }
}
