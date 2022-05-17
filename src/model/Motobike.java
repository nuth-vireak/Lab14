package model;

public abstract class Motobike {

    // fields
    private int price;
    private String brand;
    private String model;

    // setters
    private int id;

    public void setId(int id) {
        this.id = id;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // getters
    private int year;

    public int getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getId() {
        return id;
    }

    // abstract methods
    public abstract void startEngine();
    public abstract void stopEngine();
    public abstract void drive();

    // non-abstract methods
    public void display() {
        System.out.println("Id: " + id);
        System.out.println("Year: " + year);
        System.out.println("Price: " + price);
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }

    public Motobike(int id, String brand, String model, int year, int price) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }

}
