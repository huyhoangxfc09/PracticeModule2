package Demo;

import java.util.*;

public class Test {
    public static void main(String[] args) {
       Scanner scanner =new Scanner(System.in);
       Stack<Integer> stackTest = new Stack<>();
        System.out.println("Nhập số phần tử của mảng");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần tử thứ "+(i+1));
            int elment = scanner.nextInt();
            stackTest.push(elment);
        }
        System.out.println();
        System.out.println("Mảng trước khi đảo ngược:");
        for (Integer e :stackTest) {
            System.out.print(e+" ");
        }
        System.out.println();
        System.out.println("Mảng sau khi đảo ngược:");
        for (int i = 0; i < n; i++) {
            System.out.print(stackTest.pop()+" ");
        }
    }
}
