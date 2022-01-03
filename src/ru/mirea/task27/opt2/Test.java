package ru.mirea.task27.opt2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        ArrayList<City> Cities = new ArrayList<>();

        System.out.println("Создадим 5 городов");
        Cities.add(new City("Russia", "Sevastopol"));
        Cities.add(new City("Russia", "Moscow"));
        Cities.add(new City("USA", "NY"));
        Cities.add(new City("USA", "LA"));
        Cities.add(new City("Ukraine", "Kiev"));

        for (int i = 0; i < 5; i++) {
            if (map.containsKey(Cities.get(i).getCountry())) {
                map.get(Cities.get(i).getCountry()).add(Cities.get(i).getTown());
            } else {
                map.put(Cities.get(i).getCountry(), new ArrayList<>());
                map.get(Cities.get(i).getCountry()).add(Cities.get(i).getTown());
            }
        }

        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            HashMap.Entry pair = (HashMap.Entry)it.next();
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }
}
