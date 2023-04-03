import java.util.LinkedList;

public class Hw4Task2 {
    public static void main(String[] args) {

        int[] list = { 785, 456, 777, 890, 456, 612 };

        LinkedList<Integer> li = new LinkedList<>();
        for (Integer temp : list) {
            li.add(temp);
        }

        System.out.println(li);
        enqueue(li, 695);
        System.out.println(li);
        System.out.println(dequeue(li));
        System.out.println(li);
        System.out.println(first(li));
    }

    public static void enqueue(LinkedList<Integer> list, int num) {
        list.addLast(num);
    }

    public static int dequeue(LinkedList<Integer> list) {
        int num = 0;
        num = list.get(0);
        list.remove(0);
        return num;
    }

    public static int first(LinkedList<Integer> list) {
        int num = 0;
        num = list.get(0);
        return num;
    }
}
