package StudentManagement;

public class Classroom {
    private  int id;
    private String className;
    private String schoolName;

    public Classroom() {
    }

    public Classroom(int id, String className, String schoolName) {
        this.id = id;
        this.className = className;
        this.schoolName = schoolName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Classroom{" +
                "id=" + id +
                ", className='" + className + '\'' +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
    public void display(){
        System.out.printf("%-10s%-20s%s",this.id,this.className,this.schoolName+"\n");
    }
}
