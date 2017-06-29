package Models;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by _red_ on 08.06.17.
 */
public class Journal {
    private Long journalID;
    private final Calendar day;
    private List<Lesson> lessonsList;
    private Map<Lesson , List<Student>> present;
    private Map<Lesson , List<Student>> losers;

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (!(o instanceof Journal)) return false;

        Journal journal = (Journal) o;
        return (journalID == journal.journalID);

    }

    @Override
    public int hashCode() {
        return (int)(41 * journalID + 21);
    }

    public Journal(final GregorianCalendar day) {
        this.day = day;
        lessonsList = new ArrayList<>();
        present = new HashMap<>();
    }

    public void setPresent(Lesson lesson, List<Student> students) {
        this.present.put(lesson, students);
        List<Student> losers = new ArrayList<>();

        for (int i = 0; i < lesson.getGroups().size(); i++)
        {
            for (int j = 0; j < students.size(); j++)
            {
                if ( !lesson.getGroups().get(i).getStudents().contains(students.get(j)))
                    losers.add(students.get(j));
            }
        }

        this.losers.put(lesson , losers);
    }

    public Map<Lesson, List<Student>> getPresent() {
        return present;
    }

    public Map<Lesson, List<Student>> getLosers() {
        return losers;
    }
}
