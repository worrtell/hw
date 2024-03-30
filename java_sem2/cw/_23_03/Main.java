package java_sem2.cw._23_03;
import java_sem2.cw._19_03.EmptyElementException;

import java.util.function.Consumer;


public class Main {
    public static void main(String[] args) throws EmptyElementException {
        MyList<String> list = new MyList<>();
        list.add("a");
        list.add("b");

        for (String s : list) {
            System.out.println(s);
        }
    }
    public static class Printer implements Consumer<String> {

        @Override
        public void accept(String s) {

        }
    }
}
