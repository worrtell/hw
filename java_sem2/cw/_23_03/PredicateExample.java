package java_sem2.cw._23_03;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate predicate = new TestPredicate();
        System.out.println(predicate.test(201));
    }

    private static class TestPredicate implements Predicate<Integer> {
        @Override
        public boolean test(Integer integer) {
            return integer%2 == 0;
        }
    }
}
