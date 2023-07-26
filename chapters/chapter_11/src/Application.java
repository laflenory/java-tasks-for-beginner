import java.util.Arrays;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        final String[] vowels = { "A", "E", "I", "O", "U" };
        final String[] consonants = {
                "B", "C", "D", "F",
                "G", "H", "J", "K",
                "L", "M", "N", "P",
                "Q", "R", "S", "T",
                "V", "W", "X", "Y",
                "Z"
        };

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String string = scanner.nextLine();

        int vowelsCount = 0, consonantsCount = 0;

        for (String letter : string.split("")) {
            if (Arrays.stream(vowels).toList().contains(letter.toUpperCase())) {
                vowelsCount += 1;
            } else if (Arrays.stream(consonants).toList().contains(letter.toUpperCase())) {
                consonantsCount += 1;
            }
        }

        System.out.println("Гласные буквы: " + vowelsCount);
        System.out.println("Согласные буквы: " + consonantsCount);
    }
}
