import java.util.Scanner;

public class Question_2 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        double price = scanner.nextDouble();
        int Rupees = (int) price;
        int paisa = (int) (price - Rupees) * 100;
        System.out.println(Rupees + " Rupees and " + paisa + " Paise");
    }
}
