public class Novel extends Book{
    private final Author author;
    private final int numberOfChapters;

    public Novel(String title, String publisher, int publicationYear, int[] isbnNumber, Author author, int numberOfChapters) {
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
}
