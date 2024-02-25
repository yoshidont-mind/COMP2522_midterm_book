import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Book implements Comparable<Book> {
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

    public ArrayList<String> getSurnames() {
        return new ArrayList<String>();
    }

    public boolean isIdentical(final Book other) {
        return this.getIsbnNumber() == other.getIsbnNumber();
    }

    public boolean isEquivalent(final Book other) {
        return Objects.equals(this.getTitle(), other.getTitle());
    }

    public static ArrayList<Book> removeBooks(final ArrayList<Book> collection, final String title) {
        ArrayList<Book> removedBooks = new ArrayList<Book>();
        for (Book book : collection) {
            if (Objects.equals(book.getTitle(), title)) {
                removedBooks.add(book);
                collection.remove(book);
            }
        }
        return removedBooks;
    }

    public static ArrayList<Book> searchForBooks(final ArrayList<Book> collection, final String authorName) {
        ArrayList<Book> searchResult = new ArrayList<Book>();
        for (Book book : collection) {
            for (String surname : book.getSurnames()) {
                if (Objects.equals(surname, authorName)) {
                    searchResult.add(book);
                    break;
                }
            }
        }
        searchResult.sort(Book::compareTo);
        return searchResult;
    }

    @Override
    public int compareTo(final Book other) {
        return this.title.compareTo(other.title);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", publisher='" + publisher + '\'' +
                ", publicationYear=" + publicationYear +
                ", isbnNumber=" + Arrays.toString(isbnNumber) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return getPublicationYear() == book.getPublicationYear() && Objects.equals(getTitle(), book.getTitle())
                && Objects.equals(getPublisher(), book.getPublisher());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getPublisher(), getPublicationYear());
    }
}
