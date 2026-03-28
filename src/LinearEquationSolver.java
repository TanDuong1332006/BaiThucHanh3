import java.util.Scanner;

public class LinearEquationSolver {
    public static void run(Scanner sc) {
        double a, b;
        System.out.print("Nhap a, b (ax + b = 0): ");
        a = sc.nextDouble();
        b = sc.nextDouble();

        if (a == 0) {
            if (b == 0) System.out.println("Vo so nghiem");
            else System.out.println("Vo nghiem");
        } else {
            System.out.println("Nghiem x = " + (-b / a));
        }
    }
}
