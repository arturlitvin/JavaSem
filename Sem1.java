import java.util.Arrays;

// import java.util.Scanner;

// Задача 1. Написать программу, которая запросит пользователя ввести <Имя> в консоли. Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”

/**
 * Sem1
 */
// public class Sem1 {
// public static void main(String[] args) {
// System.out.println("Введите имя");
// Scanner iScanner = new Scanner(System.in, "Cp866");
// String name = iScanner.nextLine();
// System.out.printf("Привет!%s", name);
// }
// }

// Задача 2. Дан массив двоичных чисел, например [1,1,0,1,1,1,0,1,1,1,1,1],
// вывести максимальное количество подряд идущих 1.

// public class Sem1 {
//     public static void main(String[] args) {
//         int[] array = new int[] { 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1 };
//         int n = 0;
//         int max = 0;
//         for (int i = 0; i < array.length; ++i) {
//             if (array[i] == 1) 
//             {
//                 n++;
//             } 
//             else if (max < n) 
//             {
//                 max = n;
//                 n = 0;
//             }
//         }
//         if (max < n) 
//         {
//             max = n;
//             n = 0;
//         }
//         System.out.println(max);
//     }
// }

// Задача 3 Дан массив nums = [3,2,2,3,4,5,3] и число val = 3.
// Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
// Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.
// Вывод:
// [2,2,4,5,3,3,3]
/**
 * Sem1
 */
// public class Sem1 {
//     public static void main(String[] args) {
//         int[] array = new int[] { 3, 2, 2, 3, 4, 5, 3, 3, 3, 3, 3, 7, 9, 12, 22, 3, 9, 5, 2, 6, 3, 4 };
//         int val = 3;
//         int temp = 0;
//         for (int i = 0; i < array.length; i++) {
//             for (int j = 0; j < array.length - 1; j++) {
//                 if (array[j] == val) {
//                     temp = array[j];
//                     array[j] = array[i];
//                     array[i] = temp;
//                 }
//             }
//         }
//         System.out.println(Arrays.toString(array));
//     }
// }

public class Sem1 {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 5, 4, 3, 4 };
        // [1,2,4,5,4,4, 3,4 ]
        int count = 0;

        for (int i = 0; i < arr.length; i++)
            if (arr[i] != 3) {
                arr[count++] = arr[i];
            }
        
        while (count < arr.length)
            arr[count++] = 3;
        System.out.println(Arrays.toString(arr));
    }
}