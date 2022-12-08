package Production;

import java.util.Scanner;

public class ManageProduct {
   public static Production[] listProduct;

    public static void listProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product quantity: ");
        int n = Integer.parseInt(scanner.nextLine());
        listProduct = new Production[n];
        for (int i = 0; i < listProduct.length; i++) {
            int id = i + 1;
            System.out.println("Enter product name: ");
            String name = scanner.nextLine();
            System.out.println("Enter product price: ");
            int price = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter product type: ");
            String type = scanner.nextLine();
            System.out.println("Enter product currency: ");
            String currency = scanner.nextLine();
            listProduct[i] = new Production(id, name, price, type, currency);
        }
        display();
    }
    public static void display(){
        System.out.printf("%-10s", "ID");
        System.out.printf("%-10s", "Name");
        System.out.printf("%-10s", "Price");
        System.out.printf("%-10s", "Type");
        System.out.printf("%-10s", "Currency");
        System.out.println();
        for (int i = 0; i < listProduct.length; i++) {
            System.out.printf("%-10s", listProduct[i].getId());
            System.out.printf("%-10s", listProduct[i].getName());
            System.out.printf("%-10s", listProduct[i].getPrice());
            System.out.printf("%-10s", listProduct[i].getType());
            System.out.printf("%-10s", listProduct[i].getCurrency());
            System.out.println();
        }
    }

    public static void search(String value) {
        System.out.printf("%-10s", "ID");
        System.out.printf("%-10s", "Name");
        System.out.printf("%-10s", "Price");
        System.out.printf("%-10s", "Type");
        System.out.printf("%-10s", "Currency");
        System.out.println();
        for (int i = 0; i < listProduct.length; i++) {
            if (value.equals(listProduct[i].getName())) {
                System.out.printf("%-10s", listProduct[i].getId());
                System.out.printf("%-10s", listProduct[i].getName());
                System.out.printf("%-10s", listProduct[i].getPrice());
                System.out.printf("%-10s", listProduct[i].getType());
                System.out.printf("%-10s", listProduct[i].getCurrency());
                System.out.println();
            }
        }
    }
    public static void sumPrice(){
        int sum = 0;
        for (int i = 0; i < listProduct.length; i++) {
            sum+= listProduct[i].getPrice();
        }
        System.out.println("Total money:"+sum);
    }
}