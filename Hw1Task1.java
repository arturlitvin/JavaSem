// Задача 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
// Ввод:5
// Треугольное число 1 + 2 + 3 + 4 + 5 = 15
// n! 1 * 2 * 3 * 4 * 5 = 120

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