import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

// Задача 1. Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
// результат после каждой итерации запишите в лог-файл.
public class Hw2Task1 {
    public static void main(String[] args) {
        int[] arr = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        File file = new File("sort.txt");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {                 
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
            sb.append("Result number " + (i + 1) + Arrays.toString(arr) + "\n");
        }
        try {
            FileWriter fr = new FileWriter(file);
            fr.write(sb.toString());
            fr.write("\n");
            fr.close();
        } catch (IOException e) {
            System.out.println("ERROR");
        }
    }
}