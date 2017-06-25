package Models;

/**
 * Created by _red_ on 08.06.17.
 */
public class Contact {
    private ContactType contactType;
    private String value;

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (!(o instanceof Contact)) return false;

        Contact contact = (Contact) o;

        if (contactType != contact.contactType) return false;
        return value.equals(contact.value);

    }

    @Override
    public int hashCode() {
        return (41 * contactType.hashCode() + 21) + (41 * value.hashCode() + 21);
    }

    public Contact(ContactType contactType, String value) {
        this.contactType = contactType;
        this.value = value;
    }

    public ContactType getContactType() { return contactType; }

    public void setContactType(ContactType contactType) { this.contactType = contactType; }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
