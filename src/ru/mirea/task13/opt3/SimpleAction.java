package ru.mirea.task13.opt3;

public interface SimpleAction<E> {
    boolean add(E e);
    void delete(int index);
    E get(int index);
    int getSize();
    void insert(int index, E e);
}
