package MinTest3;

public class Student {
    private static int index = 1;
    private final int id;
    private String name;
    private int age;
    private String gender;
    private String address;
    private Classroom classroom;

    public Student(String name, int age, String gender, String address, Classroom classroom) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.classroom = classroom;
        this.id = index;
        index++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }
    public void display() {
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%s",
                id, name, age, gender, address, classroom.getClassName() + "\n");
    }
}
