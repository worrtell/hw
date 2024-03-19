package java_sem2.cw._19_03;

import java.util.Iterator;

public interface list <T> {
    void add(T e) throws EmptyElementException;
    void delete(int index) throws IndexOutOfBoundsException;
    T pop(); // убирает последний эл-т и возвращает его
    T get(int index) throws IndexOutOfBoundsException;
    int size();
    Iterator iterator();
}