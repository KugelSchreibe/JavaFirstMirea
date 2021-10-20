package ru.mirea.task12.opt1;

public class Student {
    private static int all;
    private int id;
    private String name;

    public Student(String name) {
        this.id = all++;
        this.name = name;
    }

    public Student() {
        this.name = "Student_" + String.valueOf(all++);
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }
}
