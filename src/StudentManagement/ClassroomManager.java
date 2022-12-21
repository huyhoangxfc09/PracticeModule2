package StudentManagement;


import java.util.ArrayList;
import java.util.Scanner;

public class ClassroomManager {
    public final ArrayList<Classroom> listClassroom;
    public ClassroomManager(){
       listClassroom = new ArrayList<>();
        listClassroom.add(0,new Classroom(1,"C0922H1","CodGym"));
        listClassroom.add(1,new Classroom(2,"C1022I1","CodGym"));
        listClassroom.add(2,new Classroom(3,"C1122K1","CodGym"));
    }

    static int index =3;
    public Classroom creatClassroom(Scanner scanner){
        int id =++index;
        System.out.println("Enter class name:");
        String className = scanner.nextLine();
        System.out.println("Enter school name:");
        String schoolName = scanner.nextLine();
        Classroom classroom= new Classroom(id,className,schoolName);
        listClassroom.add(classroom);
        return classroom;
    }
    public void displayClassroom(){
        System.out.printf("%-10s%-20s%s","ID","ClassName","School\n");
        for (Classroom element : listClassroom) {
            element.display();
        }
    }
    public void deleteClassroomById(Scanner scanner){
        if (!listClassroom.isEmpty()) {
            System.out.println("Enter id delete.");
            int id= Integer.parseInt(scanner.nextLine());
            Classroom classroom= null;
            for (Classroom element: listClassroom) {
                if(element.getId()==id){
                    System.out.println(element);
                    classroom=element;
                    System.out.println("Delete successfully");
                    break;
                }
            }
            listClassroom.remove(classroom);
        }else {
            System.out.println("Id does not exist.");
        }

    }
    public void editClassroomById(Scanner scanner){
        if(!listClassroom.isEmpty()){
            System.out.println("Enter id edit:");
            int id= Integer.parseInt(scanner.nextLine());
            for (Classroom element : listClassroom) {
                if (element.getId()==id){
                    System.out.println("Enter class name.");
                    String className = scanner.nextLine();
                    System.out.println("Enter school name");
                    String schoolName = scanner.nextLine();
                    element.setClassName(className);
                    element.setSchoolName(schoolName);
                    break;
                }
            }
        }else {
            System.out.println("Id does not exist.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        ClassroomManager classroom = new ClassroomManager();
        do {
            System.out.println("MENU");
            System.out.println("1. Add classroom.");
            System.out.println("2. Display all classroom.");
            System.out.println("3. Delete classroom by Id.");
            System.out.println("4. Edit class name by id");
            System.out.println("0. Exit.");
            System.out.println("Enter your selection: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    classroom.creatClassroom(scanner);
                    break;
                case 2:
                    classroom.displayClassroom();
                    break;
                case 3:
                    classroom.deleteClassroomById(scanner);
                    break;
                case 4:
                    classroom.editClassroomById(scanner);
                    break;
                case 0:
                    System.exit(0);
            }
        } while (true);
    }
}
