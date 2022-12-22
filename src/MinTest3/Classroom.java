package MinTest3;

public class Classroom {
    private static int index = 1;
    private final int id;
    private String className;
    private String schoolName;

    public Classroom(String className, String schoolName) {
        this.id =index;
        this.className = className;
        this.schoolName = schoolName;
        index++;
    }

    public int getId() {
        return id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
    public  void display(){
        System.out.printf("%-15s%-15s%s", id, className, schoolName + "\n");
    }
}
