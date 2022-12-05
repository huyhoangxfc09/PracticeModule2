package Module2_C1022I1;

import java.util.Scanner;

public class SystemIO {
    public static void main(String[] args) {
        //System.in: tính là input đầu vào của 1 chương trình Java, nhập từ bàn phím qua console
        Scanner scanner = new Scanner(System.in);
        //System.out: tính là output đầu ra của chương trình Java
        System.out.println("Nhập vào số muốn kiểm tra: ");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào số muốn kiểm tra: ");
        //scanner.nextLine(): lấy toàn bộ phần input vừa nhập ở console, tính theo ký tự của phím enter
        //scanner.next(): lấy toàn bộ phần input, tính theo dấu cách
//        String string = scanner.next();
        String string = scanner.nextLine();

        System.out.println(number);
        System.out.println(string);
    }
}
