import java.util.Scanner;

public class Application {
    public static int sum(String number) {
        String[] array = number.split("");

        int result = 0;

        for (String character : array) {
            result += Integer.parseInt(character);
        }

        return result;
    }

    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        String number = scanner.nextLine();

        System.out.print("Сумма цифр числа: " + sum(number));
    }
}
