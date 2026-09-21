public class BookStore {
    public static void main(String[] args) {
        Book book = new Book("Властелин Колец", "Дж. Р. Р. Толкиен", 1954, 1200);
        System.out.println(book.isBig());
        System.out.println(book.matches("Властелин"));
        System.out.println(book.matches("Тол"));
        System.out.println(book.estimatePrice());
    }
}
