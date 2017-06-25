package Manager;

import Models.Group;
import Models.Interfaces.UniqID;

import java.util.Map;
public class Manager {
    public ManagerGroups mGroups;
    public ManagerJournals mJournals;
    public ManagerLessons mLessons;

    public Manager() {
        mGroups = new ManagerGroups();
        mJournals = new ManagerJournals();
        mLessons = new ManagerLessons();
    }

    private Group addGroup(String name) {
        return mGroups.addGroup(name);
    }
}