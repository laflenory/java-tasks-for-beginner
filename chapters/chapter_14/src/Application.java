import java.util.Objects;
import java.util.Scanner;

public class Application {
    public static String coup(String string) {
        String[] array = string.split("");
        String output = "";

        for (int i = array.length - 1; i >= 0; i--) {
            output += array[i];
        }

        return output;
    }

    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String string = scanner.nextLine();

        if (Objects.equals(string, coup(string))) {
            System.out.println("Заданное слово является палиндромом.");
        } else {
            System.out.println("Заданное слово не является палиндромом.");
        }
    }
}
