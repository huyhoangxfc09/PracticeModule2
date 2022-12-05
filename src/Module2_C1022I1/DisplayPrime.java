package Module2_C1022I1;

import java.util.Scanner;

public class DisplayPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số muốn kiểm tra: ");
        int number = Integer.parseInt(scanner.nextLine());
        if (number < 2) {
            System.out.println(number + " không là SNT");
        } else {
            boolean flag = false;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println(number + " là SNT");
            } else {
                System.out.println(number + " không là SNT");
            }
        }

        //for each: vòng lặp nâng cao, enhanced loop
        int[] ints = {1,2,3,4,5};
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }

        //không lấy được index (quan trọng nhất)
        //không thay đổi được giá trị phần tử
        //không duyệt ngược mảng được
        for (int num : ints) {
            System.out.println(num);
        }
    }
}
