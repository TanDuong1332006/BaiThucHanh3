import java.util.Scanner;

public class FactorialCalculator {
    public static void run(Scanner sc) {
        int n;
        long gt = 1;
        System.out.print("Nhap n: ");
        n = sc.nextInt();

        if (n < 0) {
            System.out.println("Khong hop le!");
            return;
        }

        for (int i = 1; i <= n; i++) {
            gt *= i;
        }

        System.out.println("Ket qua: " + gt);
    }
}
