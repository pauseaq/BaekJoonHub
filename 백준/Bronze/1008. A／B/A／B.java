import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble(), b = scanner.nextDouble();
        System.out.printf("%.9f\n", a/b);
    }
}