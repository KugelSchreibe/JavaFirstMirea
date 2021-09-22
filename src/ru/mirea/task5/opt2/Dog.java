package ru.mirea.task5.opt2;

public abstract class Dog {
    private Dog() {};
    private double MAX_MASS;
    private String name;
    private String type;
    private int age;

    public Dog(String type, String name, double MAX_MASS, int age) {
        this.type = type;
        this.name = name;
        this.MAX_MASS = MAX_MASS;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public abstract String voice();

    public String getType() {
        return type;
    }

    public double getMAX_MASS() {
        return MAX_MASS;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String info() {
        return "Dog <" + type + ">\n" + "name: " + name + "\nage: " + age + "\nmax mass: " + MAX_MASS;
    }
}
