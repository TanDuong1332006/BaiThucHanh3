import java.util.Scanner;

public class PowerCalculator {
    public static void run(Scanner sc) {
        double a, b;
        System.out.print("Nhap a va b (a^b): ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        System.out.println("Ket qua: " + Math.pow(a, b));
    }
}
