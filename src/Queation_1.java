import java.util.Scanner;

public class Queation_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double sum = 0.0;
        for (double i = 1.0; i <= n; i++)
            sum += (1 / i);
        System.out.println("Sum is: " + sum);
    }

}
