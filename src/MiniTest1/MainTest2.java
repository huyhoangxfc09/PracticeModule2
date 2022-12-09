package MiniTest1;

import java.util.Scanner;

public class MainTest2 {
    private static int index = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product[] products = {};
        do {
            System.out.println("MENU");
            System.out.println("1. Tạo danh sách sản phẩm");
            System.out.println("2. Thêm sản phẩm");
            System.out.println("3. Tính tổng đơn giá sản phẩm");
            System.out.println("4. Tìm sản phẩm theo tên");
            System.out.println("5. Tìm sản phẩm theo tên gần đúng");
            System.out.println("0. Thoát");
            System.out.println("Nhập vào lựa chọn của bạn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    products = createArrayProduct(scanner);
                    break;
                case 2:
                    addProductInArrayProduct(products, scanner);
                    break;
                case 3:
                    System.out.println("Tổng đơn giá sản phẩm là: " + sumPrice(products));
                    break;
                case 4:
                    Product product = searchProductByName(products, scanner);
                    if (product != null) {
                        System.out.println(product);
                    } else {
                        System.out.println("Không có sản phẩm có tên tương ứng!");
                    }
                    break;
                case 5:
                    searchProductByNameContaining(products, scanner);
                    break;
                case 0:
                    System.exit(0);
            }
        } while (true);
    }

    public static Product[] createArrayProduct(Scanner scanner) {
        System.out.println("Nhập vào số lượng sản phẩm muốn tạo: ");
        int length = Integer.parseInt(scanner.nextLine());
        return new Product[length];
    }

    public static void addProductInArrayProduct(Product[] products, Scanner scanner) {
        if (index < products.length) {
            products[index] = createProduct(scanner);
            index++;
        } else {
            System.out.println("Danh sách sản phẩm đã đầy!");
        }
    }

    public static Product createProduct(Scanner scanner) {
        System.out.println("Nhập mã của sản phẩm thứ " + (index + 1));
        String code = scanner.nextLine();
        System.out.println("Nhập tên của sản phẩm thứ " + (index + 1));
        String name = scanner.nextLine();
        System.out.println("Nhập giá của sản phẩm thứ " + (index + 1));
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập loại của sản phẩm thứ " + (index + 1));
        String type = scanner.nextLine();
        return new Product(code, name, price, type);
    }

    public static double sumPrice(Product[] products) {
        double sum = 0;
        for (Product p : products) {
            if (p != null) {
                sum += p.getPrice();
            }
        }
        return sum;
    }

    //nếu tìm theo tên để sử dụng đối tượng, dữ liệu trả về là 1 đối tượng
    public static Product searchProductByName(Product[] products, Scanner scanner) {
        System.out.println("Nhập tên sản phẩm muốn tìm: ");
        String nameSearch = scanner.nextLine();
        Product product = null;
        for (Product p : products) {
            if (p != null) {
                //equal: để so sánh 2 giá trị bằng nhau của String hoặc object
                //contain: sử dụng để kiểm tra trong String có tồn tại chuỗi nhập vào hay không
                if (p.getName().equals(nameSearch)) {
                    product = p;
                    break;
                }
            }
        }
        return product;
    }

    //nếu tìm theo tên để hiện thị đối tượng, dữ liệu trả về là void
    public static void searchProductByNameContaining(Product[] products, Scanner scanner) {
        System.out.println("Nhập tên sản phẩm muốn tìm: ");
        String nameSearch = scanner.nextLine();
        for (Product p : products) {
            if (p != null) {
                if (p.getName().toLowerCase().contains(nameSearch.toLowerCase())) {
                    System.out.println(p);
                }
            }
        }
    }
}
