package ru.mirea.task14.opt3;

import java.util.ArrayDeque;
import java.util.Deque;

public class GameByDequeue {
    private int count;
    private Deque<Integer> Deck1;
    private Deque<Integer> Deck2;

    private GameByDequeue() {};

    public GameByDequeue(int[] arr1, int[] arr2) {
        Deck1 = new ArrayDeque<>();
        Deck2 = new ArrayDeque<>();

        for (int i = 0; i < arr1.length; i++) {
            Deck1.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            Deck2.add(arr2[i]);
        }
    }

    public String result() {
        int temp1, temp2;

        while (++count < 106) {
            temp1 = Deck1.poll();
            temp2 = Deck2.poll();

            if (temp1 == 0 && temp2 == 9) {
                Deck1.add(temp1);
                Deck1.add(temp2);

                if (Deck1.isEmpty()) {
                    return "second " + count + "\n";
                } else if (Deck2.isEmpty()) {
                    return "first " + count + "\n";
                }

                continue;
            } else if (temp1 == 9 && temp2 == 0) {
                Deck2.add(temp2);
                Deck2.add(temp1);

                if (Deck1.isEmpty()) {
                    return "second " + count + "\n";
                } else if (Deck2.isEmpty()) {
                    return "first " + count + "\n";
                }

                continue;
            }

            if (temp1 > temp2) {
                Deck1.add(temp1);
                Deck1.add(temp2);
            } else {
                Deck2.add(temp2);
                Deck2.add(temp1);
            }

            if (Deck1.isEmpty()) {
                return "second " + count + "\n";
            } else if (Deck2.isEmpty()) {
                return "first " + count + "\n";
            }
        }

        return "botva";
    }
}
