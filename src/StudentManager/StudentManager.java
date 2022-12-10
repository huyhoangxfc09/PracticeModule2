package StudentManager;

public class StudentManager {
    private int id;
    private String name;
    private int age;
    private  String gender;
    private String location;
    private double soccer;

    public StudentManager() {
    }

    public StudentManager(int id,String name, int age, String gender, String location, double soccer) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.location = location;
        this.soccer = soccer;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getSoccer() {
        return soccer;
    }

    public void setSoccer(double soccer) {
        this.soccer = soccer;
    }

    @Override
    public String toString() {
        return "StudentManager{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", location='" + location + '\'' +
                ", soccer=" + soccer +
                '}';
    }
}
