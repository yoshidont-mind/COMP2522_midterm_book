import java.lang.reflect.Array;
import java.util.ArrayList;

public class Book {
    private final String title;
    private final String publisher;
    private final int publicationYear;
    private final int[] isbnNumber; // 10 or 13 positive integers

    public Book(final String title, final String publisher, final int publicationYear, final int[] isbnNumber) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("title must not be  null, empty, or whitespace String");
        } else {
            this.title = title;
        }

        if (publisher == null || publisher.isBlank()) {
            throw new IllegalArgumentException("publisher must not be  null, empty, or whitespace String");
        } else {
            this.publisher = publisher;
        }

        this.publicationYear = publicationYear;

        if(isbnNumber.length != 10 && isbnNumber.length != 13) {
            throw new IllegalArgumentException("isbnNumber must be length 10 or 13");
        } else {
            for (int j : isbnNumber) {
                if (j <= 0) {
                    throw new IllegalArgumentException("integers in isbnNumber must be positive");
                }
            }
            this.isbnNumber = isbnNumber;
        }
    }

    public String getTitle() {
        return this.title;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public int[] getIsbnNumber() {
        return this.isbnNumber;
    }
}
