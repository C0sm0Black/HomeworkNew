package task1;

public class Book {

    private String name;
    private Author author;
    private int year;

    public Book(String name, Author author, int year) {

        this.name = name;
        this.author = author;
        this.year = year;

    }

    public String getName() {
        return this.name;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYear() {
        return this.year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString () {
        return "Название книги: " + this.name + ", автор книги: " + this.author.toString() + ", год издания: " + this.year;
    }

    public boolean equals(Book book) {
        return this.name.equals(book.name) && this.author.equals(book.author) && this.year == book.year;
    }

    public int hashCode() {
        return java.util.Objects.hash(this.name, this.author.hashCode(), this.year);
    }
}
