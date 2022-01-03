package ru.mirea.task22.opt1;

public class AbstractFabric {
    public Chair createChair(typeChair type) {
        Chair chair = null;

        switch (type) {
            case MagicChair:
                chair = new MagicChair(type.name());
                break;
            case MultiFuncChair:
                chair = new MultiFuncChair(type.name());
                break;
            case VictorianChair:
                chair = new VictorianChair(type.name());
                break;
        }

        return chair;
    }
}
