package Demo;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> student = new ArrayList<>();
        student.add(12);
        student.add(13);
        student.add(14);
        student.add(15);
        System.out.println(student.get(2));
        for (Integer element : student) {
            System.out.println(element);
        }
    }
}
