public class Hw1Task2 {
    public static void main(String[] args) {
        for (int i = 2; i <= 1000; i++) {
            Integer Simple = i;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    Simple = null;
                    break;
                }
            }
            if (Simple != null) {
                System.out.print(Simple + " ");
            }
        }
    }
}