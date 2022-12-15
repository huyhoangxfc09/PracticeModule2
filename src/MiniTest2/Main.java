package MiniTest2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Manager manager = new Manager();
        do {
            System.out.println("MENU");
            System.out.println("1. Show list of students.");
            System.out.println("2. Add students to the list");
            System.out.println("3. Delete students by name.");
            System.out.println("4. Student with the highest score.");
            System.out.println("5. Student with the lowest score.");
            System.out.println("6. Find students by name.");
            System.out.println("7. Find student gender.");
            System.out.println("8. Edit students by Id.");
            System.out.println("0. Exit.");
            System.out.println("Enter your selection: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    manager.displayAll();
                    break;
                case 2:
                    manager.addStudent(scanner);
                    break;
                case 3:
                    manager.deleteStudents(scanner);
                    break;
                case 4:
                   manager.maxStudentPoint();
                    break;
                case 5:
                    manager.minStudentPoint();
                    break;
                case 6:
                    manager.searchStudentByName(scanner);
                    break;
                case 7:
                    manager.searchStudentGender(scanner);
                    break;
                case 8:
                    manager.editStudent(scanner);
                    return;
                case 0:
                    System.exit(0);
            }
        } while (true);

    }
}
