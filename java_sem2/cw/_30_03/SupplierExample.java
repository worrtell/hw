package java_sem2.cw._30_03;

import java.util.function.Supplier;

public class SupplierExample {
    public static String s = "B";

    public static void accept(Supplier<String> supplier) {
        supplier.get();
    }

    public static void main(String[] args) {
        accept(new MySupplier());
        accept(new Supplier<String>() {
            @Override
            public String get() {
                return s;
            }
        });
    }

    static class MySupplier implements Supplier<String> {
        @Override
        public String get() {
            return s;
        }
    }
}
