// Пусть дан произвольный список целых чисел, удалить из него чётные числа
import java.util.ArrayList;
import java.util.Random;

public class Hw3Task2 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            int x = rand.nextInt(100);
            list.add(x);
        }
        System.out.println(list.toString());
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
        
        }
        System.out.println(list.toString());
    }

}
