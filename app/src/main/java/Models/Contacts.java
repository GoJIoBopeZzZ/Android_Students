package Models;

import com.innopolis.android.androidstudents.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by _red_ on 08.06.17.
 */
public class Contacts implements Iterable<Map.Entry<ContactType, List<String>>> {

    private Map<ContactType, List<String>> contacts = new HashMap<>();

    public void add(ContactType contactType, String value) {
        List<String> values = contacts.get(contactType);
        if (values == null) {
            values = new ArrayList<>();
            contacts.put(contactType, values);
        }
        values.add(value);
    }

    public List<String> get(ContactType contactType) {
        List<String> values = contacts.get(contactType);
        if (values == null) {
            values = new ArrayList<>();
            contacts.put(contactType, values);
        }
        return values;
    }

    public void set(ContactType contactType, List<String> values) {
        contacts.put(contactType, values);
    }

    @Override
    public Iterator<Map.Entry<ContactType, List<String>>> iterator() {
        return contacts.entrySet().iterator();
    }

    public int getCount() {
        return contacts.size();
    }

    public ContactType[] getContactTypes() {
        return contacts.keySet().toArray(new ContactType[contacts.size()]);
    }

}
