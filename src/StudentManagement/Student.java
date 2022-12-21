package StudentManagement;

public class Student {
    private int id;
    private String name;
    private int age;
    private String gender;
    private String address;
    private Classroom classroom;

    public Student() {
    }

    public Student(int id, String name, int age, String gender, String address, Classroom classroom) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.classroom = classroom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", classroom=" + classroom +
                '}';
    }
    public void display(){
        System.out.printf("%-5s%-10s%-10s%-20s%-20s%s",this.id,this.name,this.age,this.gender,this.address,this.classroom+"\n");
    }
}
