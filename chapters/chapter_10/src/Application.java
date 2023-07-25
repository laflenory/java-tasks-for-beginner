import java.util.Scanner;

public class Application {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);

        int first_cathetus, second_cathetus;

        System.out.print("Введите первый катет: ");
        first_cathetus = scanner.nextInt();

        System.out.print("Введите второй катет: ");
        second_cathetus = scanner.nextInt();

        System.out.println("Полученная гипотенуза: " + Math.sqrt(Math.pow(first_cathetus, 2) + Math.pow(second_cathetus, 2)));
    }
}
