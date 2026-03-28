import java.util.Scanner;

public class BasicCalculator {
    public static void run(Scanner sc) {
        double a, b;
        char op;
        System.out.print("Nhap bieu thuc (vd: 5 + 3): ");
        a = sc.nextDouble();
        op = sc.next().charAt(0);
        b = sc.nextDouble();

        switch (op) {
            case '+': System.out.println("Ket qua: " + (a + b)); break;
            case '-': System.out.println("Ket qua: " + (a - b)); break;
            case '*': System.out.println("Ket qua: " + (a * b)); break;
            case '/':
                if (b == 0) System.out.println("Loi chia 0!");
                else System.out.println("Ket qua: " + (a / b));
                break;
            default: System.out.println("Toan tu khong hop le!");
        }
    }
}
