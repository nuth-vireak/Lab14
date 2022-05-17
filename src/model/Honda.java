package model;

public class Honda extends Motobike{

    public Honda(int id, String brand, String model, int year, int price) {
        super(id, brand, model, year, price);
    }

    @Override
    public void startEngine() {
        System.out.println(getBrand() + " " + getBrand() + " " + "is started!!!!");
    }

    @Override
    public void stopEngine() {
        System.out.println(getBrand() + " " + getBrand() + " " + "is stopped!!!!");
    }

    @Override
    public void drive() {
        System.out.println(getBrand() + " " + getBrand() + " " + "is driving!!!!");
    }
}
