public final class GraphicNovel extends Novel{
    private final Illustrator illustrator;

    public GraphicNovel(String title, String publisher, int publicationYear, int[] isbnNumber, Author author,
                        int numberOfChapters, Illustrator illustrator) {
        super(title, publisher, publicationYear, isbnNumber, author, numberOfChapters);
        this.illustrator = illustrator;
    }

    public Illustrator getIllustrator() {
        return illustrator;
    }
}
