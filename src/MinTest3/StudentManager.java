package MinTest3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManager implements CrudManager<Student>{
    private final ArrayList<Student> listStudent;
    private final ClassroomManager classroomManager;
    public StudentManager(ClassroomManager classroomManager) {
        listStudent = new ArrayList<>();
        this.classroomManager = classroomManager;
    }
    public ClassroomManager getClassroomManager() {
        return classroomManager;
    }
    public ArrayList<Student> getStudents() {
        return listStudent;
    }


    @Override
    public Student create(Scanner scanner) {
        System.out.println("Enter student name: ");
        String name = scanner.nextLine();
        System.out.println("Enter student age: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter student gender: ");
        String gender = choiceGender(scanner);
        System.out.println("Enter student address: ");
        String address = scanner.nextLine();
        classroomManager.displayAll(classroomManager.getListClassroom());
        Classroom classroom = choiceClassroom(scanner);
        return new Student(name, age, gender, address, classroom);
    }

    @Override
    public void save(Student student) {

    }

    @Override
    public void update(Scanner scanner) {

    }

    @Override
    public void deleteById(Scanner scanner) {

    }

    @Override
    public Student findById(Scanner scanner) {
        return null;
    }

    @Override
    public void displayAll(List<Student> elements) {

    }
    private String choiceGender(Scanner scanner) {
        int choice;
        String gender = "";
        do {
            System.out.println("1. Male");
            System.out.println("2. Female");
            System.out.println("3. Other");
            System.out.println("Enter choice: (1 -> 3) ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    gender = "Male";
                    break;
                case 2:
                    gender = "Female";
                    break;
                case 3:
                    gender = "Other";
            }
        } while (choice < 0 || choice > 3);
        return gender;
    }
    private Classroom choiceClassroom(Scanner scanner) {
        Classroom classroom;
        System.out.println("Enter choice classroom by id: (Enter 0 for create new)");
        int idClassroom = Integer.parseInt(scanner.nextLine());
        if (idClassroom == 0) {
            classroom = classroomManager.create(scanner);
            classroomManager.save(classroom);
        } else {
            classroom = classroomManager.getById(idClassroom);
        }
        if (classroom != null) {
            return classroom;
        } else {
            return choiceClassroom(scanner);
        }
    }
    public void displayStudentById(Scanner scanner) {
        Student student = findById(scanner);
        if (student != null) {
            title();
            student.display();
        } else {
            System.out.println("Not exist student have this id!");
        }
    }
    private void title() {
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%s",
                "ID", "NAME", "AGE", "GENDER", "ADDRESS", "CLASSROOM\n");
    }
}
