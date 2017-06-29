package Models;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by _red_ on 08.06.17.
 */
public class Student implements Externalizable {

    private Sex sex;
    private String name;
    private String lastName;
    private String middleName;
    private String birthday;
    private Long groupID;
    private Passport passport;
    private Long id;
    private Contacts contacts;
    private int photoIndex;

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
        return name + "/" + lastName + "/" + middleName + ": id" + id.toString();
    }

    public Student(String name, String lastName, String middleName, String birthday,
                   Sex sex, Passport passport, Long groupID, Contacts contacts, int photoIndex) {
        this.name = name;
        this.lastName = lastName;
        this.middleName = middleName;
        this.birthday = birthday;
        this.sex = sex;
        this.passport = passport;
        this.contacts = contacts;
        this.groupID = groupID;
        this.photoIndex = photoIndex;
        this.id = name.hashCode() * System.currentTimeMillis() +
            lastName.hashCode() * System.currentTimeMillis() +
            lastName.hashCode() * System.currentTimeMillis();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getPhotoIndex() {
        return photoIndex;
    }

    public void setPhotoIndex(int photoIndex) {
        this.photoIndex = photoIndex;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) { this.birthday = birthday; }

    public Long getGroupID() {
        return groupID;
    }

    public Sex getSex() { return sex; }

    public void setSex(Sex sex) { this.sex = sex; }

    public void setGroupID(Long groupID) {
        this.groupID = groupID;
    }

    public Passport getPassport() { return passport; }

    public void setPassport(Passport passport) { this.passport = passport; }

    public Contacts getContacts() {
        return contacts;
    }

    public void setContacts(Contacts contacts) { this.contacts = contacts; }

    public Long getId() {
        return id;
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeObject(name);
        objectOutput.writeObject(lastName);
        objectOutput.writeObject(middleName);
        objectOutput.writeObject(birthday);
        objectOutput.writeObject(sex);
        objectOutput.writeObject(contacts);
        objectOutput.writeObject(groupID);
        objectOutput.writeObject(passport);
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        name = (String) objectInput.readObject();
        lastName = (String) objectInput.readObject();
        middleName = (String) objectInput.readObject();
        birthday = (String) objectInput.readObject();
        sex = (Sex) objectInput.readObject();
        contacts = (Contacts) objectInput.readObject();
        groupID = (Long) objectInput.readObject();
        passport = (Passport) objectInput.readObject();
    }
}
