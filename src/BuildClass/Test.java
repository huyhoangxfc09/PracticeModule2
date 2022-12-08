package BuildClass;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter classes: ");
        String classes = scanner.nextLine();
        BuildClass test = new BuildClass(name,classes);
        System.out.println(test.getName());
        System.out.println(test.getClasses());
    }
}
