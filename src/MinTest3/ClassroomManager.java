package MinTest3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ClassroomManager implements CrudManager<Classroom>{
    private  final ArrayList<Classroom>listClassroom;
    public ClassroomManager(){
        listClassroom = new ArrayList<>();
    }
    public ArrayList<Classroom> getListClassroom(){
        return listClassroom;
    }
    @Override
    public Classroom create(Scanner scanner) {
        System.out.println("Enter class name: ");
        String className = scanner.nextLine();
        System.out.println("Enter school name: ");
        String schoolName = scanner.nextLine();
        return new Classroom(className, schoolName);
    }

    @Override
    public void save(Classroom classroom) {
        listClassroom.add(classroom);
        System.out.println("Add classroom successfully!");
        title();
        classroom.display();
    }

    @Override
    public void update(Scanner scanner) {
        Classroom classroom = findById(scanner);
        if (classroom!=null){
            System.out.println("Enter new class name: ");
            String className = scanner.nextLine();
            if (!className.equals("")){
                classroom.setClassName(className);
            }
            System.out.println("Enter new school name: ");
            String schoolName = scanner.nextLine();
            if (!schoolName.equals("")) {
                classroom.setSchoolName(schoolName);
            }
            System.out.println("Update classroom successfully!");
            title();
            classroom.display();
        }else {
            System.out.println("Not exist classroom have this id!");
        }
    }

    @Override
    public void deleteById(Scanner scanner) {
        Classroom classroom = findById(scanner);
        if (classroom != null) {
            listClassroom.remove(classroom);
            System.out.println("Delete classroom successfully!");
            title();
            classroom.display();
        } else {
            System.out.println("Not exist classroom have this id!");
        }
    }

    @Override
    public Classroom findById(Scanner scanner) {
        System.out.println("Enter id classroom: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (Classroom element : listClassroom) {
            if(element.getId()==id){
                return element;
            }
        }
        return null;
    }

    @Override
    public void displayAll(List<Classroom>classrooms) {
        if (!classrooms.isEmpty()) {
            System.out.println("List classroom: ");
            title();
            for (Classroom element : classrooms) {
                element.display();
            }
        } else {
            System.out.println("List classroom haven't element!");
        }
    }
    private void title() {
        System.out.printf("%-15s%-15s%s", "ID", "NAME", "SCHOOL_NAME\n");
    }
    public Classroom getById(int classroomId){
        for (Classroom element:listClassroom) {
            if(element.getId()==classroomId){
                return element;
            }
        }
        return null;
    }
}
