import java.util.ArrayList;
import java.util.Objects;

public abstract class Creator {
    private final String name;
    private final String surname; // must be in name

    public Creator(String name, String surname) {
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

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Creator{" +
                "name=" + name +
                ", surname='" + surname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Creator creator)) return false;
        return Objects.equals(getName(), creator.getName()) && Objects.equals(getSurname(), creator.getSurname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname());
    }
}
