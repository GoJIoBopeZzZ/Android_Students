package Models;

/**
 * Created by _red_ on 27.06.17.
 */

public class Passport {
    private String serial;
    private String number;

    public Passport(String serial, String number) {
        this.serial = serial;
        this.number = number;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Passport passport = (Passport) o;

        if (!serial.equals(passport.serial)
                || !number.equals(passport.number)) return false;
        return true;

    }

    @Override
    public int hashCode() {
        int result = serial.hashCode();
        result = 31 * result + number.hashCode();
        return result;
    }
}
