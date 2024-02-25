import java.util.ArrayList;

public final class Textbook extends Book{
    private final ArrayList<Author> authors;
    private final int numberOfChapters;
    private final String url;

    public Textbook(final String title, final String publisher, final int publicationYear, final int[] isbnNumber,
                    final ArrayList<Author> authors, final int numberOfChapters, final String url) {
        super(title, publisher, publicationYear, isbnNumber);

        if (authors == null) {
            throw new IllegalArgumentException("authors must not be null");
        } else {
            this.authors = authors;
        }

        if (numberOfChapters <= 0) {
            throw new IllegalArgumentException("numberOfChapters must be positive");
        } else {
            this.numberOfChapters = numberOfChapters;
        }

        if (url == null || url.isBlank()) {
            throw new IllegalArgumentException("url must not be  null, empty, or whitespace String");
        } else {
            this.url = url;
        }
    }

    public ArrayList<Author> getAuthors() {
        return authors;
    }

    public int getNumberOfChapters() {
        return numberOfChapters;
    }

    public String getUrl() {
        return url;
    }
}
