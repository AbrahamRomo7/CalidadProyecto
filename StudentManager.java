import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private List<String> students = new ArrayList<>();

    public void addStudent(String student) {
        students.add(student);
        System.out.println("Student added: " + student);
    }

    public void listStudents() {
        for (String student : students) {
            System.out.println(student);
        }
    }

    public static void main(String[] args) {
        StudentManager sm = new StudentManager();
        sm.addStudent("John");
        sm.addStudent("Jane");
        sm.listStudents();
    }
}

