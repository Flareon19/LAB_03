import java.util.Scanner;

public class Question_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int date = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();
        int D = year % 100;
        int C = year / 100;
        int f = (date + (((13 * month) - 1) / 5) + D + (D / 4) + (C / 4) - (2 * C));
        int day = f % 7;
        switch (day) {
            case 1:
                System.out.print(date + "th " + " of " + year + " was a Monday!");
                break;
            case 2:
                System.out.print(date + "th " + " of " + year + " was a Tuesday!");
                break;
            case 3:
                System.out.print(date + "th " + " of " + year + " was a Wednesday!");
                break;
            case 4:
                System.out.print(date + "th " + " of " + year + " was a Thursday!");
                break;
            case 5:
                System.out.print(date + "th " + " of " + year + " was a Friday!");
                break;
            case 6:
                System.out.print(date + "th " + " of " + year + " was a Saturday!");
                break;
            case 0:
                System.out.print(date + "th " + " of " + year + " was a Sunday!");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + day);
        }
    }
}
