import java.util.ArrayList;
import java.util.Objects;

public class Novel extends Book{
    private final Author author;
    private final int numberOfChapters;

    public Novel(String title, String publisher, int publicationYear, int[] isbnNumber, Author author,
                 int numberOfChapters) {
        super(title, publisher, publicationYear, isbnNumber);
        this.author = author;
        if (numberOfChapters <= 0) {
            throw new IllegalArgumentException("numberOfChapters must be positive");
        } else {
            this.numberOfChapters = numberOfChapters;
        }
    }

    public Author getAuthor() {
        return author;
    }

    public int getNumberOfChapters() {
        return numberOfChapters;
    }

    @Override
    public ArrayList<String> getSurnames() {
        ArrayList<String> surnames = new ArrayList<String>();
        surnames.add(this.getAuthor().getSurname());
        return surnames;
    }

    @Override
    public String toString() {
        return "Novel{" +
                "author=" + author +
                ", numberOfChapters=" + numberOfChapters +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Novel novel)) return false;
        if (!super.equals(o)) return false;
        return getNumberOfChapters() == novel.getNumberOfChapters() && Objects.equals(getAuthor(), novel.getAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getAuthor(), getNumberOfChapters());
    }
}
