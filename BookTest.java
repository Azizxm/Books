public class BookTest {
    public static void main(String[] args) {
        try {
            Book book1 = new Book("Java Programming", "John Doe", "1234567890", 300);
            Book book2 = new Book("Python Basics", "Jane Smith", "0987654321", 250);

            System.out.println("Book 1 details: " + book1);
            System.out.println("Book 2 details: " + book2);

            // Testing invalid input
            book1.setTitle(""); // This will throw an exception

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
