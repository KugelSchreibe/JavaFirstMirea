package ru.mirea.task12.opt2;

import ru.mirea.task12.opt1.Student;

public class Student2_0 extends Student {
    private int mark;

    public Student2_0(String name, int mark) {
        super(name);
        this.mark = mark;
    }

    public Student2_0() {
        super();
        this.mark = (int)(Math.random() * 10);
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public int getMark() {
        return mark;
    }

    @Override
    public String toString() {
        return "Student2_0{" +
                "name=" + getName() +
                ", id=" + getId() +
                ", mark=" + mark +
                '}';
    }
}
