// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка.
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;
public class Hw3Task3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random ran = new Random();
        int sum = 0;
        
        for (int i = 0; i < 10; i++) {
            int x = ran.nextInt(10000);
            list.add(x);
            sum+=list.get(i);
        }
        
        System.out.println(list.toString());
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
        System.out.println(sum/list.size());
    }

}
