import java.util.Scanner;

public class SqrtCalculator {
    public static void run(Scanner sc) {
        double a;
        System.out.print("Nhap so: ");
        a = sc.nextDouble();
        if (a < 0) System.out.println("Khong ton tai!");
        else System.out.println("Ket qua: " + Math.sqrt(a));
    }
}
