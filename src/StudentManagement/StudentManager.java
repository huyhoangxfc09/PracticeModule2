package StudentManagement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StudentManager {
    private final ArrayList<Student> listStudents;
    public StudentManager(){
        listStudents = new ArrayList<>();
    }
    static int index = 0;
    ClassroomManager classroomManager = new ClassroomManager();
    private String choiceGender(Scanner scanner){
        System.out.println("1. Male");
        System.out.println("2. Female");
        System.out.println("3. Other");
        System.out.println("Enter your choice: ");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                return "Male";
            case 2:
                return "Female";
            default:
                return "Other";
        }
    }
    private Classroom choiceClassroom(Scanner scanner){
        System.out.println("Enter id classroom");
        int id =Integer.parseInt(scanner.nextLine());
        Classroom classroom;
        for (Classroom e: classroomManager.listClassroom) {
            if (e.getId()==id){
                classroom=e;
                return classroom;
            }
        }
       return classroomManager.creatClassroom(scanner);
    }
    public Student creatStudents(Scanner scanner){
        int id = ++index;
        System.out.println("Enter name student.");
        String name = scanner.nextLine();
        System.out.println("Enter age student.");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter gender student.");
        String gender = choiceGender(scanner);
        System.out.println("Enter address student.");
        String address = scanner.nextLine();
        classroomManager.displayClassroom();
        Classroom classroom = choiceClassroom(scanner);
        return new Student(id,name,age,gender,address,classroom);
    }
    public void addStudent(Scanner scanner){
        listStudents.add(creatStudents(scanner));
    }
    public void displayStudent(){
        System.out.printf("%-5s%-10s%-10s%-20s%-20s%s","ID","NAME","AGE","GENDER","ADDRESS","CLASSROOM\n");
        for (Student element : listStudents) {
            element.display();
        }
    }
    public void deleteStudentById(Scanner scanner){
        System.out.println("Enter id student delete.");
        int id = Integer.parseInt(scanner.nextLine());
        Iterator<Student> iterator = listStudents.iterator();
        while (iterator.hasNext()){
            if(iterator.next().getId()==id){
                iterator.remove();
            }
        }
        for (Student element:listStudents) {
            element.display();
        }
    }
    public boolean checkId(int id){
        for (Student element : listStudents) {
            if(element!=null){
                if (element.getId()==id){
                    return true;
                }
            }
        }
        return false;
    }
    public  void showStudentById(Scanner scanner){
        System.out.println("Enter the student id to display.");
        int id = Integer.parseInt(scanner.nextLine());
        if (checkId(id)) {
            System.out.printf("%-5s%-10s%-10s%-20s%-20s%s","ID","NAME","AGE","GENDER","ADDRESS","CLASSROOM\n");
            for (Student element : listStudents) {
                if(element.getId()==id){
                    element.display();
                }
            }
        }else {
            System.out.println("Id does not exist");
        }
    }
    public  boolean checkClassName(String className){
        for (Classroom element : classroomManager.listClassroom) {
            if(element!=null){
                if (element.getClassName().equals(className)){
                    return true;
                }
            }
        }
        return false;
    }


}
