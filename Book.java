public class Book {
    private String title;
    private String author;
    private String isbn;
    private int numPages;

    public Book(String title, String author, String isbn, int numPages) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.numPages = numPages;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getNumPages() {
        return numPages;
    }

    // Setters with Exception Handling
    public void setTitle(String title) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Title cannot be null or empty");
        }
        this.title = title;
    }

    public void setNumPages(int numPages) {
        if (numPages <= 0) {
            throw new IllegalArgumentException("Number of pages must be positive");
        }
        this.numPages = numPages;
    }

    // toString method
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", numPages=" + numPages +
                '}';
    }
}
