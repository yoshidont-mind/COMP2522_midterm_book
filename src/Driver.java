import java.util.ArrayList;

public class Driver {
    public static void main(String[] argv) {
        ArrayList<Book> collection = new ArrayList<Book>();
        ArrayList<Author> authors = new ArrayList<Author>();

        ArrayList<String> authorNameOne = new ArrayList<String>();
        authorNameOne.add("Tats");
        ArrayList<String> authorNameTwo = new ArrayList<String>();
        authorNameTwo.add("Chris");
        ArrayList<String> authorNameThree = new ArrayList<String>();
        authorNameThree.add("Nabil");

        authors.add(new Author(authorNameOne, "Tats"));
        authors.add(new Author(authorNameTwo, "Chris"));
        authors.add(new Author(authorNameThree, "Nabil"));

        int[] isbnNumberOne = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int[] isbnNumberTwo = {1, 1, 1, 1, 1, 1, 1, 1, 1, 2};
        int[] isbnNumberThree = {1, 1, 1, 1, 1, 1, 1, 1, 1, 3};
        int[] isbnNumberFour = {1, 1, 1, 1, 1, 1, 1, 1, 1, 4};
        int[] isbnNumberFive = {1, 1, 1, 1, 1, 1, 1, 1, 1, 5};
        int[] isbnNumberSix = {1, 1, 1, 1, 1, 1, 1, 1, 1, 6};

        collection.add(new Novel("A", "aPublisherName", 1998, isbnNumberOne,
                authors.get(0), 2));
        collection.add(new Novel("B", "aPublisherName", 1998, isbnNumberTwo,
                authors.get(1), 2));
        collection.add(new Novel("C", "aPublisherName", 1998, isbnNumberThree,
                authors.get(2), 2));
        collection.add(new Novel("D", "aPublisherName", 1998, isbnNumberFour,
                authors.get(0), 2));
        collection.add(new Novel("E", "aPublisherName", 1998, isbnNumberFive,
                authors.get(1), 2));
        collection.add(new Novel("F", "aPublisherName", 1998, isbnNumberSix,
                authors.get(2), 2));

        System.out.println("Books in the collection are:");
        for (Book book : collection) {
            System.out.println(book);
        }
        System.out.println();

        System.out.println("When search for books written by 'Chris', the result is:");
        for (Book book : Book.searchForBooks(collection, "Chris")) {
            System.out.println(book);
        }
    }
}
