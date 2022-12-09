package MiniTest1;

import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //tạo mảng sản phẩm rỗng
        Product[] products = createArrayProduct();
        //lấp đầy mảng sản phẩm ở trên
        createProduct(products);
        //tính tổng đơn giá
        System.out.println("Tổng số đơn giá của các sản phẩm là: " + sumPrice(products));
        //tìm sản phẩm theo tên
        System.out.println("Nhập vào tên sản phẩm muốn tìm: ");
        String nameSearch = scanner.nextLine();
        Product product = searchProductByName(products, nameSearch);
        if (product != null) {
            System.out.println(product);
        } else {
            System.out.println("Không có sản phẩm có tên như trên!");
        }
    }

    public static Product[] createArrayProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số lượng sản phẩm muốn tạo: ");
        int length = Integer.parseInt(scanner.nextLine());
        return new Product[length];
    }

    public static void createProduct(Product[] products) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < products.length; i++) {
            System.out.println("Nhập mã của sản phẩm thứ " + (i + 1));
            String code = scanner.nextLine();
            System.out.println("Nhập tên của sản phẩm thứ " + (i + 1));
            String name = scanner.nextLine();
            System.out.println("Nhập giá của sản phẩm thứ " + (i + 1));
            double price = Double.parseDouble(scanner.nextLine());
            System.out.println("Nhập loại của sản phẩm thứ " + (i + 1));
            String type = scanner.nextLine();
            products[i] = new Product(code, name, price, type);
        }
    }

    public static double sumPrice(Product[] products) {
        double sum = 0;
        for (Product p : products) {
            sum += p.getPrice();
        }
        return sum;
    }

    public static Product searchProductByName(Product[] products, String name) {
        Product product = null;
        for (Product p : products) {
            if (p.getName().equals(name)) {
                product = p;
                break;
            }
        }
        return product;
    }
}

