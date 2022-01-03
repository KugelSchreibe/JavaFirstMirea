package ru.mirea.task28;

public class Test {
    public static void main(String[] args) {
        System.out.println("Создадим обычную машину модели BMW, с ценой 100000$");
        Car car = new Car("MBW", 100000);
        System.out.println(car.toString());
        System.out.println("\nТеперь узнаем сколько будет стоить эта машина когда станет раритетом\n" + car.toStringOldCar());
    }
}
