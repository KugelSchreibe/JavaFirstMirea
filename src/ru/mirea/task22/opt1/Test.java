package ru.mirea.task22.opt1;

public class Test {
    public static void main(String[] args) {
        System.out.println("Фабрика стульев, создадим 3 стула на фабрике и посадим на них клиента...");

        AbstractFabric fabric = new AbstractFabric();
        Client client = new Client();

        client.sit(fabric.createChair(typeChair.MagicChair));
        client.sit(fabric.createChair(typeChair.MultiFuncChair));
        client.sit(fabric.createChair(typeChair.VictorianChair));
    }
}
