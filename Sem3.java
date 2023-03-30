import java.util.ArrayList;

// Заполнить список десятью случайными числами. Отсортировать список методом sort() и вывести его на экран.

// import java.io.IOException;
// import java.util.ArrayList;
// import java.util.Comparator;
// import java.util.Random;

// public class Sem3 {
//     public static void main(String[] args) throws IOException {
//         ArrayList<Integer> ar = new ArrayList<Integer>();
//         Random ran = new Random();
//         for (int i = 0; i < 10; i++) {
//             int x = ran.nextInt(10);
//             ar.add(x);
//         }
//         System.out.println(ar.toString());
//         ar.sort(Comparator.naturalOrder());
//         System.out.println(ar.toString());
//     }

// }

// Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. Вывести название каждой планеты и количество его повторений в списке.

// import java.util.ArrayList;
import java.util.Arrays;

public class Sem3 {
    public static void main(String[] args) {
        ArrayList<String> ar = new ArrayList<>(
                Arrays.asList("Sun", "Mercury", "Venus", "Sun", "Mars", "Mercury", "Sun", "Earth", "Mars", "Jupiter",
                        "Saturn", "Uranus", "Neptun", "Pluto"));
        int count = 0;
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < ar.size(); i++) {
            count = 0;
            if (!result.contains(ar.get(i))) {
                result.add(ar.get(i));
                for (int j = 0; j < ar.size(); j++) {

                    if (ar.get(i).equals(ar.get(j))) {
                        count += 1;

                    }
                }
                System.out.println(count + " "+ ar.get(i));
            }
        }
    }
}

/**
 * Sem3
 */

//  Создать список типа ArrayList. Поместить в него как строки, так и целые числа. Пройти по списку, найти и удалить целые числа.
// public class Sem3 {

//     public static void main(String[] args) {
//         ArrayList<Object> list = new ArrayList<>();
//         list.add("asdad5");
//         list.add("asdad4");
//         list.add("asdad3");
//         list.add(22);
//         list.add(22);
//         list.add(22);
//         list.add("asdad2");
//         list.add("asdad1");
//         list.add(22);

//         System.out.println(list);
//         // for (int i = list.size() - 1; i >= 0; i--) {
//         // if (list.get(i) instanceof Integer) {
//         // list.remove(i);

//         // }
//         for (int i = 0; i < list.size(); i++) {
//             if (list.get(i) instanceof Integer) {
//                 list.remove(i);
//                 i--;
//             }
//         }
//         System.out.println(list);

//     }
// }
