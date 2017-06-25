package Models;

import java.io.Serializable;
import java.util.*;

/**
 * Created by _red_ on 08.06.17.
 */
public class Student implements Serializable{
    private String name;
    private String surName;
    private String lastName;
    private Calendar birthday;
    private Long groupID;
    private Long id;
    private List<Contact> contacts;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return id != null ? id.equals(student.id) : student.id == null;
    }

    @Override
    public int hashCode() {
        return (int) (21 + getId() * 42);
    }

    @Override
    public String toString() {
        return name + "/" + surName + "/" + lastName + ": id" + id.toString();
    }

    public Student(String name, String surName, String lastName, Calendar birthday, Long groupID) {
        this.name = name;
        this.surName = surName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.groupID = groupID;
        this.id = name.hashCode() * System.currentTimeMillis() +
            lastName.hashCode() * System.currentTimeMillis() +
            lastName.hashCode() * System.currentTimeMillis();
        this.contacts = new ArrayList<>();
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Calendar getBirthday() {
        return birthday;
    }

    public void setBirthday(Calendar birthday) { this.birthday = birthday; }

    public Long getGroupID() {
        return groupID;
    }

    public void setGroupID(Long groupID) {
        this.groupID = groupID;
    }

    public Long getId() {
        return id;
    }
}
