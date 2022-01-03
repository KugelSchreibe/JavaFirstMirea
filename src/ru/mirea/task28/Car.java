package ru.mirea.task28;

public class Car {
    private String model;
    private int price;

    public Car(String model, int price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    public String toStringOldCar() {
        oldCar car = new oldCar(this.getModel(), this.getPrice());
        return "Old car{" +
                "model='" + car.getModel()+ '\'' +
                ", price=" + car.getPrice() +
                '}';
    }

    private class oldCar extends Car {
        public oldCar(String model, int price) {
            super(model, price * 2);
        }

        @Override
        public int getPrice() {
            return super.getPrice();
        }

        @Override
        public String getModel() {
            return super.getModel();
        }
    }
}
