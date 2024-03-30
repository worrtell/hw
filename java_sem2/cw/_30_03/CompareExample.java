package java_sem2.cw._30_03;

import java.util.Comparator;

public class CompareExample {
    private static Integer a = 100;
    private static Integer b = 100;

    public static void method(Comparator<Integer> comparator) {
        if (comparator.compare(a,b) > 0) {
            System.out.println(">");
        }
        else if (comparator.compare(a,b) < 0) {
            System.out.println("<");
        }
        else {
            System.out.println("=");
        }
    }
    public static void main(String[] args) {
        method(new IntComparator());

        method(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });

        method((x,y) -> {return x-y;});
        method((x,y) -> x - y);
    }

    private static class IntComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2-o1;
        }
    }
}
