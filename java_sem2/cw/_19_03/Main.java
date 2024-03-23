package java_sem2.cw._19_03;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) throws Exception {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        Iterator<Integer> a = list.iterator();
        while (a.hasNext()) {
            System.out.println(a.next());
        }
        a.remove();
        a.remove();
    }
}
