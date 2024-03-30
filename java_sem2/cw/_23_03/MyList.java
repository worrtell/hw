package java_sem2.cw._23_03;

import java_sem2.cw._19_03.EmptyElementException;
import java_sem2.cw._19_03.list;
import java.util.Iterator;

public class MyList<T> implements list<T>, Iterable<T> {
    private Object[] array = new Object[16];
    private int size = 0;

    @Override
    public void add(T e) throws EmptyElementException {
        array[size++] = e;
    }

    @Override
    public void delete(int index) throws IndexOutOfBoundsException {
        System.arraycopy(array,index+1,array,index,(--size)-index);
    }

    @Override
    public T pop() {
        return null;
    }

    @Override
    public T get(int index) throws IndexOutOfBoundsException {
        return (T) array[index];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator();
    }

    public class MyIterator implements Iterator<T> {
        int cur = 0;
        @Override
        public boolean hasNext() {
            return cur < size;
        }

        @Override
        public T next() {
            return (T) array[cur++];
        }
    }
}
