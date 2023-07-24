import java.util.Scanner;
import java.text.MessageFormat;
import java.util.Arrays;

public class Application {
    public static double average(int[] numbers) {
        return (double) Arrays.stream(numbers).sum() / numbers.length;
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
        System.out.println("Среднее арифметическое значение для заданного массива: " + average(numbers));
    }
}
