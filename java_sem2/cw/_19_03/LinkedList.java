package java_sem2.cw._19_03;

import java.util.Iterator;

public class LinkedList<T> implements list<T>, java.lang.Iterable<T> {
    private Node<T> head;
    private Node<T> cur;
    private int size;

    public LinkedList() {
        size = 0;
    }

    public void print() {
        Node<T> temp = this.head;
        while (temp.next != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println(temp.value);
    }
    public void add(T e) throws EmptyElementException {
        if (e == null) {
            throw new EmptyElementException();
        }
        Node<T> temp = new Node(e);
        if (head == null) {
            head = temp;
            cur = head;
        }
        else {
            cur.next = temp;
            cur = cur.next;
        }
        ++ size;
    }

    public void delete(int index) throws IndexOutOfBoundsException {
        if (index >= size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            head = head.next;
        }
        else {
            Node<T> temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            --size;
        }
    }

    public T pop() {
        if (size == 0) {
            return null;
        }
        else {
            Node<T> temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
            -- size;
            return temp.value;
        }
    }

    public T get(int index) throws IndexOutOfBoundsException {
        if (index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node<T> temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.value;
    }

    public int size() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator<T>();
    }

    private class MyIterator<T> implements Iterator<T> {

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public T next() {
            return null;
        }

        @Override
        public void remove() {
        }
    }
}
