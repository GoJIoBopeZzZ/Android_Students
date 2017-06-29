package Manager;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import Models.Passport;
import Models.Student;

/**
 * Created by elisium on 08/06/2017.
 */
public class ManagerStudents implements Serializable {

//    private final static long SerialVersionUUID = 1;
    private Map<Passport, Student> students;
    private List<Student> studentList;

//    public static ManagerStudents instance = new ManagerStudents();
//    public static ManagerStudents getInstance() {
//        return instance;
//    }

    public ManagerStudents(List<Student> list) {
        students = new HashMap<>();
        studentList = new ArrayList<>(list);

        for (Student entry : list) {
            students.put(entry.getPassport(),entry);
        }
    }

    public void addStudent (Student student) {
//        if (student == null) return;
        students.put(student.getPassport() , student);
        studentList.add(student);
    }

    public Student getStudent (Passport passport) {
        return students.get(passport);
    }

    public int count() {
        return studentList.size();
    }
}