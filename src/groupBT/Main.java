package groupBT;


import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== MAY TINH =====");
            System.out.println("1. Tinh co ban (+ - * /)");
            System.out.println("2. Luy thua");
            System.out.println("3. Can bac hai");
            System.out.println("4. Giai thua");
            System.out.println("5. Giai PT bac 1");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: BasicCalculator.run(sc); break;
                case 2: PowerCalculator.run(sc); break;
                case 3: SqrtCalculator.run(sc); break;
                case 4: FactorialCalculator.run(sc); break;
                case 5: LinearEquationSolver.run(sc); break;
                case 0: System.out.println("Tam biet!"); break;
                default: System.out.println("Khong hop le!");
            }

        } while (choice != 0);

        sc.close();
    }
}


