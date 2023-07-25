import java.util.Scanner;

public class Application {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите радиус круга: ");
        int radius = scanner.nextInt();

        System.out.println("Площадь круга: " + (Math.PI * Math.pow(radius, 2)));
    }
}
