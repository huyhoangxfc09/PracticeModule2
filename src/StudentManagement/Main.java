package StudentManagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager studentManager =new StudentManager();
        ClassroomManager classroomManager = new ClassroomManager();
        do {
            System.out.println("MENU");
            System.out.println("1. Add Student.");
            System.out.println("2. Display all student.");
            System.out.println("3. Display classroom.");
            System.out.println("4. Edit class name by id");
            System.out.println("5. Show students by id.");
            System.out.println("0. Exit.");
            System.out.println("Enter your selection: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    studentManager.addStudent(scanner);
                    break;
                case 2:
                    studentManager.displayStudent();
                    break;
                case 3:
                    classroomManager.displayClassroom();
                    break;
                case 4:
                    studentManager.deleteStudentById(scanner);
                    break;
                case 5:
                    studentManager.showStudentById(scanner);
                    break;
                case 0:
                    System.exit(0);
            }
        } while (true);
    }
}
