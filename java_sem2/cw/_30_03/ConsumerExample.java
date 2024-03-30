package java_sem2.cw._30_03;

import java.util.function.Consumer;

public class ConsumerExample {
    public static String s = "R";

    public static void accept(Consumer<String> consumer) {
        consumer.accept(s);
    }

    public static void main(String[] args) {
        accept(new MyConsumer());
        accept(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        accept(((str) -> {
            System.out.println(s);
        }));
        accept(str -> System.out.println(s));


    }

    public static class MyConsumer implements Consumer<String> {
        public void accept(String a) {
            System.out.println(s);
        }
    }
}
