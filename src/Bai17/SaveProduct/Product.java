package Bai17.SaveProduct;

import java.io.Serializable;

public class Product implements Serializable {
    private static int INDEX =1;
    private int id;
    private String name;
    private String manufacturer;
    private int price;

    public Product() {
    }

    public Product(String name, String manufacturer, int price) {
        this.id = INDEX;
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
        INDEX++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                '}';
    }
    public void display(){
        System.out.printf("%-10s%-15s%-15s%s",id,name,manufacturer,price+"\n");
    }
}
