public class Book {
    String title;
    String author;
    int releaseYear;
    int pages;

    public Book(String title, String author, int releaseYear, int pages) {
        this.title = title;
        this.author = author;
        this.releaseYear = releaseYear;
        this.pages = pages;
    }

    public boolean isBig() {
        return pages > 500;
    }

    public boolean matches(String word) {
        return author.contains(word) || title.contains(word);
    }

    public int estimatePrice() {
        int price = 3 * pages;
        return Math.max(price, 250);
    }
}
