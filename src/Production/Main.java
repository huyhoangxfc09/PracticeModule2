package Production;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ManageProduct.listProduct();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Product search:");
        String value=scanner.nextLine();
        ManageProduct.search(value);
    }
}
