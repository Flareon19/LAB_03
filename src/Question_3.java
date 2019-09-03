import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double Fahrenheit = scanner.nextDouble();
        double Celsius = (Fahrenheit - 32) / 1.8;
        System.out.println(Celsius);
    }
}
