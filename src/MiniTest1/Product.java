package MiniTest1;

public class Product {
    private String code;
    private String name;
    private double price;
    private String type;
    private String unitMoney;

    public Product() {
    }

    public Product(String code, String name, double price, String type, String unitMoney) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.type = type;
        this.unitMoney = unitMoney;
    }

    public Product(String code, String name, double price, String type) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.type = type;
        this.unitMoney = "USD";
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUnitMoney() {
        return unitMoney;
    }

    public void setUnitMoney(String unitMoney) {
        this.unitMoney = unitMoney;
    }

    @Override
    public String toString() {
        return "Product{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", unitMoney='" + unitMoney + '\'' +
                '}';
    }
}
