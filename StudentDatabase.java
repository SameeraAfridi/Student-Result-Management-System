import java.util.*;
 
public class StudentDatabase {
    private static List<Student> students = new ArrayList<>();
 
    public static void addStudent(Student student) {
        students.add(student);
    }
 
    public static Student findStudentById(String id) {
        for (Student s : students) {
            if (s.getId().equals(id)) {
                return s;
            }
        }
        return null;
    }
 
    public static List<Student> getAllStudents(){
        return students;
    }
}

