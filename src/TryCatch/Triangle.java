package TryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 3 sides of the triangle.");
        int a=0 , b =0, c= 0;
        boolean checkA = true,checkB = true,checkC = true;
        while (checkA) {
            try {
                System.out.println("Enter edge a.");
                a = Integer.parseInt(scanner.nextLine());
                checkA = false;
            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println("Re-enter a");
            }
        }
        try {
            System.out.println("Enter edge b.");
            b = Integer.parseInt(scanner.nextLine());
            checkB =false;
        }catch (InputMismatchException|NumberFormatException e){
            System.out.println("Re-enter b");
        }
        while (checkB) {
            try {
                System.out.println("Enter edge b.");
                b = Integer.parseInt(scanner.nextLine());
                checkB = false;
            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println("Re-enter b");
            }
        }
        try {
            System.out.println("Enter edge c.");
            c = Integer.parseInt(scanner.nextLine());
            checkC =false;
        }catch (InputMismatchException|NumberFormatException e){
            System.out.println("Re-enter c");
        }
        while (checkC) {
            try {
                System.out.println("Enter edge c.");
                c = Integer.parseInt(scanner.nextLine());
                checkC = false;
            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println("Re-enter c");
            }
        }
        try {
            checkTriangle(a, b, c);
        } catch (Exception e) {
            System.out.println("Not a triangle");
        }
}

    public static void checkTriangle(int a, int b, int c) throws Exception {
        if (a > 0 && b > 0 && c > 0) {
            if (a + b > c && a + c > b && c + b > a) {
                System.out.println("This a triangle");
            } else throw new Exception();
        } else throw new Exception();
    }
}
