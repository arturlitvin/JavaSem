import java.util.Scanner;

public class Hw1Task1 {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int Num = iScanner.nextInt();
        int Triangular  = Num * (Num + 1) / 2;
        int Factorial = 1;
        for (int i = 1; i <= Num; i++) {
            Factorial = Factorial*i;
        }
        System.out.printf("Треугольное число: %s\n", Triangular);
        System.out.printf("Факториал числа: %s", Factorial);
        iScanner.close();
    }
}