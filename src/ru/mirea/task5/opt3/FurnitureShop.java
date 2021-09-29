package ru.mirea.task5.opt3;
import java.util.ArrayList;

public class FurnitureShop {
    private ArrayList<Cupboard> AllCupboard;
    private ArrayList<Table> AllTable;
    private int countTable, countCupboard;

    public FurnitureShop() {
        countCupboard = countTable = 0;
        AllCupboard = new ArrayList<Cupboard>();
        AllTable = new ArrayList<Table>();
    };

    public void pushBackTable(double price, String material, double dimensionsLength, double dimensionsWidth,
                              double dimensionsHeight, boolean folding) {
        AllTable.add(new Table(price, material, dimensionsLength, dimensionsWidth, dimensionsHeight, folding));
        countTable++;
    }

    public void pushBackTable() {
        AllTable.add(new Table());
        countTable++;
    }

    public void pushBackCupboard(double price, String material, double dimensionsLength, double dimensionsWidth,
                                 double dimensionsHeight, int shelp,String color) {
        AllCupboard.add(new Cupboard(price, material, dimensionsLength, dimensionsWidth, dimensionsHeight, shelp, color));
        countCupboard++;
    }

    public void pushBackCupboard() {
        AllCupboard.add(new Cupboard());
        countCupboard++;
    }

    public void popBackCupboard() {
        if (countCupboard > 0) {
            countCupboard--;
            AllCupboard.remove(countCupboard);
        }
    }

    public void popBackTable() {
        if (countTable > 0) {
            countTable--;
            AllTable.remove(countTable);
        }
    }

    public String info() {
        return "Количество столов: " + countTable + "\nКоличество шкафов: " + countCupboard;
    }
}
