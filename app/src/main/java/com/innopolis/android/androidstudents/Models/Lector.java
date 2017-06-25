package Models;

import java.util.Date;
import java.util.List;

/**
 * Created by _red_ on 08.06.17.
 */
public class Lector {
    private String name;
    private String surName;
    private String lastName;
    private Date age;
    private Long id;
    private List<Group> groupList;
    private Subject subject;

    public Lector(String name, String surName, String lastName, Date age, Subject subject) {
        this.name = name;
        this.surName = surName;
        this.lastName = lastName;
        this.age = age;
        this.subject = subject;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Lector lector = (Lector) o;

        if (name != null ? !name.equals(lector.name) : lector.name != null) return false;
        if (surName != null ? !surName.equals(lector.surName) : lector.surName != null) return false;
        if (lastName != null ? !lastName.equals(lector.lastName) : lector.lastName != null) return false;
        if (age != null ? !age.equals(lector.age) : lector.age != null) return false;
        if (id != null ? !id.equals(lector.id) : lector.id != null) return false;
        if (groupList != null ? !groupList.equals(lector.groupList) : lector.groupList != null) return false;
        return subject == lector.subject;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surName != null ? surName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        return result;
    }
}
