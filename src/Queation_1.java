import java.util.Scanner;

public class Queation_1 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double sum = 1.0;
        for (int i = 1; i <= n; i++)
            sum += (double) (1 / i);
        System.out.println("Sum is: " + sum);
    }

}
