package java_sem2.cw._19_03;

//public class Array<T> implements list<T> {
//    private final int k = 2;
//    private int size;
//    private Object[] array;
//    private int cur;
//
//    public Array(int size) {
//        this.size = size;
//        this.array = new Object[size];
//        this.cur = 0;
//    }
//    public void print() {
//        for (int i = 0; i < cur; i++) {
//            System.out.print(array[i] + " ");
//        }
//        System.out.println();
//    }
//
//    public void newArray() {
//        Object[] dst = new Object[size*k];
//        System.arraycopy(array,0,dst,0,array.length);
//        this.array = dst;
//    }
//    public void add(T e) throws EmptyElementException {
//        if (e == null) {
//            throw new EmptyElementException();
//        }
//        if (cur < size) {
//            array[cur] = e;
//        }
//        else {
//            newArray();
//            array[cur] = e;
//        }
//        ++ cur;
//    }
//
//    public void delete(int index) throws IndexOutOfBoundsException {
//        if (index >= cur) {
//            throw new IndexOutOfBoundsException();
//        }
//        -- cur;
//        for (int i = index; i < cur; i++) {
//            array[i] = array[i+1];
//        }
//    }
//
//    public T pop() {
//        if (cur == 0) {
//            return null;
//        }
//        else {
//            -- cur;
//            return (T) array[cur];
//        }
//    }
//    public T get(int index) throws IndexOutOfBoundsException {
//        if (index >= cur) {
//            throw new IndexOutOfBoundsException();
//        }
//        return (T) array[index];
//    }
//
//    public int size() {
//        return cur;
//    }
//}
