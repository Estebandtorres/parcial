public class Book {
    private String title;
    private String isbn;
    private String author;
    private int publicationYear;
    private boolean available;
    private int timesLoaned;
    static int contador=0;
    
    /**
     * Constructor completo para crear un libro
     * @param title El título del libro
     * @param isbn El identificador único ISBN
     * @param author El autor del libro
     * @param publicationYear El año de publicación
     */
    public Book(String title, String isbn, String author, int publicationYear) {
        this.title = title;
        this.isbn = isbn;
        this.author = author;
        this.publicationYear = publicationYear;
        this.available = true;
        this.timesLoaned = 0;
    }
    
    // Getters
    public String getTitle() {
        return title;
    }
    
    public String getIsbn() {
        return isbn;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public int getPublicationYear() {
        return publicationYear;
    }
    
    public boolean isAvailable() {
        return available;
    }
    
    public int getTimesLoaned() {
        return timesLoaned;
    }
    
    // Setters
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
    
    public void setAvailable(boolean available) {
        this.available = available;
    }
    
    public void setTimesLoaned(int timesLoaned) {
        this.timesLoaned = ++timesLoaned;
    }
    
    /**
     * Presta el libro si está disponible
     * @return true si se pudo prestar, false si no estaba disponible
     */
    public boolean lend() {
        if (available) {
            available = false;
            timesLoaned++;
            return true;
        }
        return false;
    }
    
    /**
     * Devuelve el libro, marcándolo como disponible
     */
    public void returnBook() {
        available = true;
    }
    
    /**
     * Representación legible del libro
     * @return String con la información del libro
     */
    @Override
    public String toString() {
        return "title: " + this.title + " isbn: " + this.isbn + " author :" + this.author + "Publication year: " + this.publicationYear + " available: " + this.available + " timesLoaned: " + this.timesLoaned;
    }
}
