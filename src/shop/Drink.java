package shop;

public class Drink {
    
    public String name;
    public int price;
    public int stock;
    public Size size;

    // constructor
    public Drink(String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public Drink(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Drink(String name, int price, Size size) {
        this.name = name;
        this.price = price;
        this.size = size;
    }
    
}