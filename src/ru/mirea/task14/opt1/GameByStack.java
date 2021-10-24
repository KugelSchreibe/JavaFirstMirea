package ru.mirea.task14.opt1;

import java.util.Stack;

public class GameByStack {
    private Stack<Integer> deck1;
    private Stack<Integer> deck2;
    private int count;

    private GameByStack() {};

    public GameByStack(int[] arr1, int[] arr2) {
        deck1 = new Stack<Integer>();
        deck2 = new Stack<Integer>();

        for (int i = 0; i < arr1.length; i++) {
            deck1.push(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            deck2.push(arr2[i]);
        }

        invertStack(deck1);
        invertStack(deck2);
    }

    private void invertStack(Stack<Integer> e) {
        int[] arr = new int[e.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = e.pop();
        }
        e.clear();
        for (int i = 0; i < arr.length; i++) {
            e.push(arr[i]);
        }
    }

    public String simpleSolution() {
        int temp1, temp2;
        while (++count < 106) {
            temp1 = deck1.pop();
            temp2 = deck2.pop();

            if (temp1 == 0 && temp2 == 9) {
                deck1.add(0, temp1);
                deck1.add(0, temp2);

                if (deck1.empty()) {
                    return "second " + count + "\n";
                } else if (deck2.empty()) {
                    return "first " + count + "\n";
                }

                continue;
            } else if (temp2 == 0 && temp1 == 9) {
                deck2.add(0, temp2);
                deck2.add(0, temp1);

                if (deck1.empty()) {
                    return "second " + count + "\n";
                } else if (deck2.empty()) {
                    return "first " + count + "\n";
                }

                continue;
            }

            if (temp1 > temp2) {
                deck1.add(0, temp1);
                deck1.add(0, temp2);
            } else {
                deck2.add(0, temp2);
                deck2.add(0, temp1);
            }

            if (deck1.empty()) {
                return "second " + count + "\n";
            } else if (deck2.empty()) {
                return "first " + count + "\n";
            }
        }

        return "botva";
    }
}
