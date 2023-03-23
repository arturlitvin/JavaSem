import java.util.Scanner;

public class Hw1Task3 {
    public static void main(String[] args) {

        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        double Num1 = iScanner.nextDouble();

        Scanner iScanner1 = new Scanner(System.in);
        System.out.printf("Введите операцию (+,-,*,/): ");
        String Operation = iScanner1.nextLine();

        Scanner iScanner2 = new Scanner(System.in);
        System.out.printf("Введите второе число: ");
        double Num2 = iScanner2.nextDouble();
        iScanner.close();
        iScanner1.close();
        iScanner2.close();

        if (Operation.equals("+")) {
            System.out.print(Num1 + Num2);
        } else if (Operation.equals("-")) {
            System.out.print(Num1 - Num2);
        } else if (Operation.equals("*")) {
            System.out.print(Num1 * Num2);
        } else if (Operation.equals("/")) {
            System.out.print(Num1 / Num2);
        }

    }
}
