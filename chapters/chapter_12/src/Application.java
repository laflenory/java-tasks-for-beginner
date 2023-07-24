import java.util.Scanner;

public class Application {
    public static String revert(String string) {
        char[] characters = string.toCharArray();

/*
        StringBuilder result = new StringBuilder();
        for (int i = characters.length - 1; i >= 0; i--) {
            result.append(characters[i]);
        }
        return result.toString();
*/

        String result = "";

        for (int i = characters.length - 1; i >= 0 ; i--) {
            result += characters[i];
        }

        return result;
    }

    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String string = scanner.nextLine();

        System.out.println("Результат: " + revert(string));
    }
}
