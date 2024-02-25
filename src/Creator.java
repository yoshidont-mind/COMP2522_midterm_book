import java.util.ArrayList;

public abstract class Creator {
    private final ArrayList<String> name;
    private final String surname; // must be in name

    public Creator(ArrayList<String> name, String surname) {
        if (name == null) {
            throw new IllegalArgumentException("name must not be null");
        } else {
            this.name = name;
        }

        if (surname == null || surname.isBlank()) {
            throw new IllegalArgumentException("surname must not be  null, empty, or whitespace String");
        } else if (!name.contains(surname)) {
            throw new IllegalArgumentException("surname must be in name");
        } else {
            this.surname = surname;
        }
    }

    public ArrayList<String> getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
