// Дано четное число N (>0) и символы c1 и c2. Написать метод, который вернет строку длины N,
// которая состоит из чередующихся символов c1 и c2, начиная с c1.

// 6 a b
// ababab
// import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
// import javax.swing.plaf.TextUI;

// public class Sem2 {
//     public static String builders(String a, String b, int N) {
//         StringBuilder sb = new StringBuilder();
//         for (int i = 0; i < N / 2; i++) {
//             sb.append(a);
//             sb.append(b);
//         }
//         return sb.toString();

//     }

//     public static void main(String[] args) {
//         System.out.print("Введите число N: ");
//         Scanner iScanner = new Scanner(System.in);
//         int N = iScanner.nextInt();
//         String a = "c1", b = "c2";
//         System.out.printf(builders(a, b, N));
//         iScanner.close();
//     }
// }

/**
 * Sem2
 */
// Напишите метод void, который сжимает строку. Пример: вход aaaabbbcddaa.
// результат - a4b3cd2a2

// public class Sem2 {

// public static void name(String N) {
// StringBuilder sb = new StringBuilder();
// int count = 1;
// char temp = N.charAt(0);
// sb.append(temp);
// for (int i = 1; i < N.length(); i++) {
// if (temp != N.charAt(i)) {
// if (count != 1) {
// sb.append(count);
// count = 1;
// }
// sb.append(N.charAt(i));
// temp = N.charAt(i);
// } else {
// count += 1;
// }
// }
// if (count != 1) {
// sb.append(count);
// }
// System.out.printf("Вот такая хрень получилась: %s\n",sb.toString());

// }

// public static void main(String[] args) {
// System.out.print("Введите строку: ");
// Scanner iScanner = new Scanner(System.in);
// String N = iScanner.nextLine();
// name(N);
// iScanner.close();
// }
// }

// Напишите метод, который принимает на вход строку (String) и определяет
// является ли строка палиндромом (возвращает boolean значение).

// public class Sem2 {
//     public static boolean name(String N) {
//         for (int i = 0; i < N.length() / 2; i++) {
//             if (N.charAt(i) != N.charAt((N.length() - i - 1)))
//                 return false;
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.println("Введите строку: ");
//         String N = iScanner.nextLine();
//         System.out.println(name(N));
//         iScanner.close();
//     }
// }



public class Sem2 {
    public static void main(String[] args) {
        File file = new File("aaa.txt");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb.append("test ");
        }
        try {
            FileWriter fr = new FileWriter(file, true);
            fr.write(sb.toString());
            fr.write("\n");
            fr.close();
        } catch (IOException e) {
            System.out.println("ERROR ");
        }
    }
}