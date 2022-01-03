package ru.mirea.task13.opt3;

public class MyArrayList<E> implements SimpleAction<E> {
    private E[] array;
    private int capasity;
    private int size;

    public MyArrayList() {
        capasity = 10;
        size = 0;
        array = (E[]) new Object[10];
    }

    @Override
    public boolean add(E e) {
        if (size + 1 >= capasity) {
            E[] temp = array;

            capasity = (int)Math.pow(size, 2);
            array = (E[]) new Object[capasity];


            for (int i = 0; i < size; i++) {
                array[i] = temp[i];
            }

            array[size++] = e;

            return true;
        } else {
            array[size++] = e;
            return true;
        }
    }

    @Override
    public void delete(int index) {
        E[] temp = array;
        array = (E[]) new Object[size - 1];

        for (int i = 0, j = 0; i < size; j++) {
            if (j != index) {
                array[i++] = temp[j];
            }
        }

        size--;
    }

    @Override
    public E get(int index) {
        return array[index];
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void insert(int index, E e) {
        array[index] = e;
    }
}
