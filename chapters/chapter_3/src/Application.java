import java.util.Arrays;
import java.util.Scanner;

public class Application {
    public static int max(int[] numbers, int length) {
        int max = numbers[0];

        for (int i = 1; i < length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }

        return max;
    }

    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);

        int current = 0;

        final int length = 3;
        int[] numbers = new int[length];

        while (current != length) {
            System.out.print("Введите число: ");
            int number = scanner.nextInt();

            numbers[current] = number;
            current++;
        }

        System.out.print("Максимальное число: ");
        System.out.println(max(numbers, length));
    }
}
