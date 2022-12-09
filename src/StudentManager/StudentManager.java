package StudentManager;

public class StudentManager {
    private String name;
    private int age;
    private  String gender;
    private String location;
    private int soccer;

    public StudentManager() {
    }

    public StudentManager(String name, int age, String gender, String location, int soccer) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.location = location;
        this.soccer = soccer;
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

    public int getSoccer() {
        return soccer;
    }

    public void setSoccer(int soccer) {
        this.soccer = soccer;
    }

    @Override
    public String toString() {
        return "StudentManager{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", location='" + location + '\'' +
                ", soccer=" + soccer +
                '}';
    }
}
