package StudentManager;

import java.util.Scanner;

public class OptionManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager[] listStudentManager = {};
        do {
            System.out.println("MENU");
            System.out.println("1. Create a list of students.");
            System.out.println("2. Student with the highest score.");
            System.out.println("3. Student with the lowest score.");
            System.out.println("4. Search students by name.");
            System.out.println("5. Search gender student.");
            System.out.println("6. Add student.");
            System.out.println("7. Delete students by.");
            System.out.println("8. Exit students by Id.");
            System.out.println("0. Exit.");
            System.out.println("Enter your selection: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    listStudentManager = creatArrayStudentManager(scanner);
                    creatStudentManager(listStudentManager, scanner);
                    break;
                case 2:
                    maxSoccerStudent(listStudentManager);
                    break;
                case 3:
                    minSoccerStudent(listStudentManager);
                    break;
                case 4:
                   searchNameStudent(listStudentManager, scanner);
                case 5:
                    searchGenderStudent(listStudentManager, scanner);
                    break;
                case 6:
                    addStudent(listStudentManager, scanner);
                    break;
                case 7:
                    deleteByNameStudent(listStudentManager, scanner);
                    break;
                case 8:
                    exitById(listStudentManager, scanner);
                    break;
                case 0:
                    System.exit(0);
            }
        } while (true);

    }

    public static StudentManager[] creatArrayStudentManager(Scanner scanner) {
        System.out.println("Enter the number of student: ");
        int numberStudent = Integer.parseInt(scanner.nextLine());
        return new StudentManager[numberStudent];
    }

    public static void creatStudentManager(StudentManager[] student, Scanner scanner) {
        for (int i = 0; i < student.length; i++) {
            int id = i+1;
            System.out.println("Enter name student rank " + (i + 1));
            String name = scanner.nextLine();
            System.out.println("Enter age student rank  " + (i + 1));
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter gender student rank  " + (i + 1));
            String gender = scanner.nextLine();
            System.out.println("Enter location student rank  " + (i + 1));
            String location = scanner.nextLine();
            System.out.println("Enter soccer student rank  " + (i + 1));
            double soccer = Double.parseDouble(scanner.nextLine());
            student[i] = new StudentManager(id,name,age,gender,location,soccer);
        }
        for (StudentManager tempt : student) {
            System.out.println(tempt);
        }
    }

    public static void maxSoccerStudent(StudentManager[] studentManagers) {
        double max = studentManagers[0].getSoccer();
        for (int i = 1; i < studentManagers.length; i++) {
            if (max < studentManagers[i].getSoccer()) {
                max = studentManagers[i].getSoccer();
            }
        }
        StudentManager[] maxSoccerStudent = new StudentManager[studentManagers.length];
        int index = 0;
        for (StudentManager element : studentManagers) {
            if (element.getSoccer() == max) {
                maxSoccerStudent[index] = element;
                index++;
            }
        }
        for (StudentManager student : maxSoccerStudent) {
            System.out.println(student);
        }
    }

    public static void minSoccerStudent(StudentManager[] studentManagers) {
        double min = studentManagers[0].getSoccer();
        for (int i = 1; i < studentManagers.length; i++) {
            if (min > studentManagers[i].getSoccer()) {
                min = studentManagers[i].getSoccer();
            }
        }
        StudentManager[] minSoccerStudent = new StudentManager[studentManagers.length];
        int index = 0;
        for (StudentManager element : studentManagers) {
            if (element.getSoccer() == min) {
                minSoccerStudent[index] = element;
                index++;
            }
        }
        for (StudentManager student : minSoccerStudent) {
            System.out.println(student);
        }
    }

    public static void searchNameStudent(StudentManager[] studentManagers, Scanner scanner) {
        StudentManager[] searchNameStudent = new StudentManager[studentManagers.length];
        System.out.println("Enter the name you want to check:");
        String nameSearch = scanner.nextLine();
        int index = 0;
        for (StudentManager student:studentManagers) {
            if(student != null){
                if (student.getName().equals(nameSearch)){
                    searchNameStudent[index]=student;
                    index++;
                }
            }
        }
        for (StudentManager name:searchNameStudent) {
            System.out.println(name);
        }
    }

    public static void searchGenderStudent(StudentManager[] studentManagers, Scanner scanner) {
        StudentManager[] results = new StudentManager[studentManagers.length];
        System.out.println("Enter the gender you want to check:");
        String genderSearch = scanner.nextLine();
        int index = 0;
        for (StudentManager student : studentManagers) {
            if (student != null) {
                if (student.getGender().equals(genderSearch)) {
                    results[index] = student;
                    index++;
                }
            }
        }
        for (StudentManager genders : results) {
            System.out.println(genders);
        }
    }

    public static void addStudent(StudentManager[] studentManagers, Scanner scanner) {
        StudentManager[] addStudent = new StudentManager[studentManagers.length + 1];
        System.arraycopy(studentManagers, 0, addStudent, 0, studentManagers.length);
        int id = addStudent.length;
        System.out.println("Enter name student rank ");
        String name = scanner.nextLine();
        System.out.println("Enter age student rank  ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter gender student rank  ");
        String gender = scanner.nextLine();
        System.out.println("Enter location student rank  ");
        String location = scanner.nextLine();
        System.out.println("Enter soccer student rank  ");
        double soccer = Double.parseDouble(scanner.nextLine());
        addStudent[addStudent.length - 1] = new StudentManager(id,name,age,gender,location,soccer);
        for (StudentManager student : addStudent) {
            System.out.println(student);
        }
    }

    public static void deleteByNameStudent(StudentManager[] studentManagers, Scanner scanner) {
        StudentManager[] deleteStudent = new StudentManager[studentManagers.length - 1];
        System.out.println("Enter the name to delete:");
        String deleteName = scanner.nextLine();
        for (int i = 0; i < studentManagers.length; i++) {
            if (studentManagers[i].getName().equals(deleteName)) {
                for (int j = i; j < studentManagers.length - 1; j++) {
                    studentManagers[j] = studentManagers[j + 1];
                }
            }
        }
        System.arraycopy(studentManagers, 0, deleteStudent, 0, deleteStudent.length);
        for (StudentManager student : deleteStudent) {
            System.out.println(student);
        }
    }
    public static void exitById(StudentManager[]studentManagers,Scanner scanner){
        System.out.println("Enter Id exit:");
        int id =Integer.parseInt(scanner.nextLine());
        System.out.println("Enter name student rank  "+id);
        String name = scanner.nextLine();
        System.out.println("Enter age student rank  "+id);
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter gender student rank  "+id);
        String gender = scanner.nextLine();
        System.out.println("Enter location student rank  "+id);
        String location = scanner.nextLine();
        System.out.println("Enter soccer student rank  "+id);
        double soccer = Double.parseDouble(scanner.nextLine());
        if ((0<=id)||(id<=studentManagers.length)){
            for (int i = 0; i < studentManagers.length; i++) {
                if(i==(id-1)){
                    studentManagers[i]= new StudentManager(id,name,age,gender,location,soccer);
                }
            }
            for (StudentManager student:studentManagers) {
                System.out.println(student);
            }
        }else {
            System.out.println("You have entered the wrong ID in the list. Please re-enter.");
        }

    }
}
