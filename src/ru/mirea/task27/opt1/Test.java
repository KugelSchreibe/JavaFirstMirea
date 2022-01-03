package ru.mirea.task27.opt1;

import java.util.HashMap;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        HashMap<String, String> people = new HashMap<>();

        System.out.println("Список людей: ");
        people.put("Пивоваров", "Сергей");
        people.put("Уваров", "Егор");
        people.put("Ильин", "Виктор");
        people.put("Долгов", "Сергей");
        people.put("Кулешов", "Иван");
        people.put("Исаев", "Илья");
        people.put("Куликов", "Вадим");
        people.put("Лаврентьев", "Вадим");
        people.put("Кокорева", "Ирина");
        people.put("Иванов", "Данил");

        System.out.println("Все имена: ");
        Iterator it = people.entrySet().iterator();
        while (it.hasNext()) {
            HashMap.Entry pair = (HashMap.Entry)it.next();
            System.out.println(pair.getKey() + " " + pair.getValue());
        }

        it = people.entrySet().iterator();
        Iterator it1;
        while (it.hasNext()) {
            it1 = people.entrySet().iterator();
            HashMap.Entry pair = (HashMap.Entry)it.next();

            while (it1.hasNext()) {
                HashMap.Entry pair1 = (HashMap.Entry)it1.next();
                if (!pair1.getKey().equals(pair.getKey())) {
                    if (pair1.getValue().equals(pair.getValue())) {
                        people.remove(pair1.getKey());
                        it = people.entrySet().iterator();
                        break;
                    }
                }
            }
        }


        System.out.println("\nВсе имена после удления с одинаковым именем:\n");
        it = people.entrySet().iterator();
        while (it.hasNext()) {
            HashMap.Entry pair = (HashMap.Entry)it.next();
            System.out.println(pair.getKey() + " " + pair.getValue());
        }

    }
}
