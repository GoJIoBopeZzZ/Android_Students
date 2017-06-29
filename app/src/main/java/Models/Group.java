package Models;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by _red_ on 08.06.17.
 */
public class Group implements Iterable {
    private String name;
    private Long groupID;
    private List<Student> students;

    @Override
    public Iterator<Student> iterator() {
        return this.students.iterator();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (!(o instanceof Group)) return false;

        Group group = (Group)o;
        return (groupID == group.groupID);
    }

    @Override
    public int hashCode() {
        return (int)(groupID * 41 + 21);
    }

    public Group(String name) {
        this(name, null);
    }

    public Group(String name, List<Student> students) {
        this.name = name;
        this.groupID = System.currentTimeMillis() * 21 + System.currentTimeMillis() * 42;
        if (students == null) this.students = new ArrayList<>();
        else this.students = students;
    }

    public void addStudent(Student student) {
        if (student != null)
            this.students.add(student);
    }

    public void removeStudent(Student student) {
        if (student != null)
            this.students.remove(student);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getGroupID() {
        return groupID;
    }

    public List<Student> getStudents() {
        return students;
    }
}
