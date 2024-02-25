import java.util.ArrayList;

public final class Author extends Creator{
    public Author(ArrayList<String> name, String surname) {
        super(name, surname);
    }

    @Override
    public String toString() {
        return "Author{}";
    }
}
