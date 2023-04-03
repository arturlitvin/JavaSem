// 1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.

// 2) Замерьте время, за которое в LinkedList добавятся 10000 элементов. Сравните с предыдущим.
// import java.util.ArrayList;
import java.util.LinkedList;

// public class Sem4 {
//     public static void main(String[] args) {
//         long timeStart_1 = System.currentTimeMillis();
//         ArrayList<Integer> resultList = new ArrayList<>();
//         for (int i = 0; i < 100000; i++) {
//         resultList.add(0, i);
//         }
//         long timeFinish_1 = System.currentTimeMillis();

//         long timeStart_2 = System.currentTimeMillis();

//         LinkedList<Integer> listLink = new LinkedList<>();
//         for (int i = 0; i < 1000000; i++) {
//         listLink.add(0, i);
//         }
//         long timeFinish_2 = System.currentTimeMillis();
//         System.out.printf("The time_1 = %d \n", timeFinish_1 - timeStart_1);
//         System.out.printf("The time_2 = %d \n", timeFinish_2 - timeStart_2);
//         System.out.println(timeFinish_2);
//         }
// }

import java.util.Deque;
import java.util.Scanner;

public class Sem4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Deque<String> queue = new LinkedList<String>();

        System.out.println("Enter string: ");
        String str = scn.nextLine();
        while (!str.contains("print")) {
            queue.add(str);
            System.out.print(queue.toString());
            System.out.println("Enter new string: ");
            str = scn.nextLine();
        }
        while (!queue.isEmpty()) {
            System.out.println(queue.pollLast());
        }
        System.out.print(queue.toString());
        scn.close();
    }
}