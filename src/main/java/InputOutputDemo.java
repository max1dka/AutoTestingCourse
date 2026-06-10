import java.util.Scanner;

public class InputOutputDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();
        String second = scanner.nextLine();
        System.out.print(first + ' ' + second);
        scanner.close(); // Чтение значений с клавиатуры
    }
}
