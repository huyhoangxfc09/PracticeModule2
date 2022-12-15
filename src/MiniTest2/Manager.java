package MiniTest2;

import java.util.Scanner;

public class Manager {
    public StudentManager[] studentList = new StudentManager[10];
    private int index = 0;

    private StudentManager creatStudent(Scanner scanner) {
        int id = index + 1;
        System.out.println("Enter name student rank " + (index + 1));
        String name = scanner.nextLine();
        System.out.println("Enter age student rank  " + (index + 1));
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter gender student rank  " + (index + 1));
        String gender = scanner.nextLine();
        System.out.println("Enter location student rank  " + (index + 1));
        String location = scanner.nextLine();
        System.out.println("Enter soccer student rank  " + (index + 1));
        double point = Double.parseDouble(scanner.nextLine());
        return new StudentManager(id, name, age, gender, location, point);
    }

    public void addStudent(Scanner scanner) {
        if (index <= studentList.length) {
            studentList[index] = creatStudent(scanner);
            index++;
        }
    }

    public void displayAll() {
        boolean check = false;
        for (StudentManager element : studentList) {
            if (element != null) {
                System.out.println(element);
                check = true;
            }
        }
        if (!check) {
            System.out.println("The list does not currently have any students.");
        }
    }

    private boolean checkExistById(int id) {
        for (StudentManager element : studentList) {
            if (element != null) {
                if (element.getId() == id) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean checkExistByName(String name) {
        for (StudentManager element : studentList) {
            if (element != null) {
                if (element.getName().equals(name)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void deleteStudents(Scanner scanner) {
        System.out.println("Enter the student you want to delete by name:");
        String name = scanner.nextLine();
        for (int i = 0; i < studentList.length; i++) {
            if (checkExistByName(name)) {
                for (int j = i; j < studentList.length - 1; j++) {
                    studentList[j] = studentList[j + 1];
                }
                System.out.println("Delete successfully.");
            }
        }
    }

    public void maxStudentPoint() {
        double max = studentList[0].getPoint();
        for (int i = 0; i < studentList.length; i++) {
            if (studentList[i] != null) {
                if (max < studentList[i].getPoint()) {
                    max = studentList[i].getPoint();
                }
            }
        }
        for (StudentManager student: studentList) {
            if(student!=null){
                if(max==student.getPoint()){
                    System.out.println(student);
                }
            }
        }
    }
    public void minStudentPoint() {
        double min = studentList[0].getPoint();
        for (int i = 0; i < studentList.length; i++) {
            if (studentList[i] != null) {
                if (min > studentList[i].getPoint()) {
                    min = studentList[i].getPoint();
                }
            }
        }
        for (StudentManager student: studentList) {
            if(student!=null){
                if(min==student.getPoint()){
                    System.out.println(student);
                }
            }
        }
    }
    public void  searchStudentByName(Scanner scanner){
        System.out.println("Enter the name you are looking for:");
        String name = scanner.nextLine();
        if (checkExistByName(name)){
            for (StudentManager student : studentList) {
                if(student!=null){
                    if(student.getName().equals(name)){
                        System.out.println(student);
                    }
                }
            }
        }
    }
    public void searchStudentGender(Scanner scanner){
        System.out.println("Enter gender:");
        String gender = scanner.nextLine();
        for (StudentManager student:studentList) {
            if (student!=null){
                if(student.getGender().equals(gender)){
                    System.out.println(student);
                }
            }
        }
    }
    public void editStudent(Scanner scanner){
        System.out.println("Enter id edit:");
        int id = Integer.parseInt(scanner.nextLine());
        if (checkExistById(id)) {
            System.out.println("Enter name student rank ");
            String name = scanner.nextLine();
            System.out.println("Enter age student rank  ");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter gender student rank  ");
            String gender = scanner.nextLine();
            System.out.println("Enter location student rank  ");
            String location = scanner.nextLine();
            System.out.println("Enter soccer student rank  ");
            double point = Double.parseDouble(scanner.nextLine());
            studentList[id].setId(id);
            studentList[id].setName(name);
            studentList[id].setAge(age);
            studentList[id].setGender(gender);
            studentList[id].setLocation(location);
            studentList[id].setPoint(point);
            System.out.println(studentList[id]);
        }
    }
}
