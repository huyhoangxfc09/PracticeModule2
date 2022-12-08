package Production;

import java.util.Scanner;

public class Production {
    private int id;
    private String name;
    private int price;
    private String type;
    private String currency;
    public Production(){

    }

    public Production(int id, String name, int price, String type, String currency) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.type = type;
        this.currency = currency;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}


