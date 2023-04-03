import java.util.LinkedList;

public class Hw4Task1 {
    public static void main(String[] args)
    {
        LinkedList<String> li = new LinkedList<String>();
        li.add("Element1");
        li.add("Element2");
        li.add("Element3");
        System.out.print("Before reversing: " + li);
        li = reverseLinkedList(li);
        System.out.print("\nAfter reversing: " + li);
    }
    public static LinkedList<String> reverseLinkedList(LinkedList<String> rlist)
    {
        LinkedList<String> revList = new LinkedList<String>();
        for (int i = rlist.size() - 1; i >= 0; i--) {
 
            revList.add(rlist.get(i));
        }
        return revList;
    }
}

