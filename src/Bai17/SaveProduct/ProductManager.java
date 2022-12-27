package Bai17.SaveProduct;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    private final ArrayList<Product> listProduction;

    public ProductManager() {
        listProduction = new ArrayList<>();
    }

    public void tile() {
        System.out.printf("%-10s%-15s%-15s%s", "ID", "NAME", "MANUFACTURER", "PRICE\n");
    }

    public Product create(Scanner scanner) {
        System.out.println("Enter name production:");
        String name = scanner.nextLine();
        System.out.println("Enter name manufacturer:");
        String manufacturer = scanner.nextLine();
        System.out.println("Enter product price:");
        int price = Integer.parseInt(scanner.nextLine());
        return new Product(name, manufacturer, price);
    }

    public void save(Product product) {
        listProduction.add(product);
        File file = new File("C:\\D\\Java\\PracticeModule2\\src\\Bai17\\SaveProduct\\ListProduct");
        writeProduct(file, listProduction);
        System.out.println("Add production successfully!");
        tile();
        product.display();
    }

    public static void writeProduct(File file, ArrayList<Product> listProduction) {
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file, true));
            objectOutputStream.writeObject(listProduction);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Product> readProduct(File file) {
        ArrayList<Product>products = new ArrayList<>();
        try {
           FileInputStream fis = new FileInputStream(file);
           ObjectInputStream ois = new ObjectInputStream(fis);
           products = (ArrayList<Product>) ois.readObject();
           fis.close();
           ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return products;
    }

    public void displayAll(List<Product> products) {
        if (!products.isEmpty()) {
            System.out.println("List production: ");
            tile();
            for (Product e : products) {
                e.display();
            }
        } else {
            System.out.println("List production haven't element!");
        }
    }

    public static void main(String[] args) {
        File file = new File("C:\\D\\Java\\PracticeModule2\\src\\Bai17\\SaveProduct\\ListProduct");
        ProductManager productManager = new ProductManager();
        Scanner scanner = new Scanner(System.in);
        Product product = productManager.create(scanner);
        productManager.save(product);
        List<Product> list = readProduct(file);
        for (Product e : list) {
            System.out.println(e);
        }
    }
}
