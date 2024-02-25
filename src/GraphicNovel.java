import java.util.Objects;

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

    @Override
    public String toString() {
        return "GraphicNovel{" +
                "illustrator=" + illustrator +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GraphicNovel that)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(getIllustrator(), that.getIllustrator());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getIllustrator());
    }
}
