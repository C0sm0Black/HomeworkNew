package task1;

public class Main {

    public static void main(String[] args) {

        Author author1 = new Author("Лукьяненко", "Сергей");
        Author author2 = new Author("Желязны", "Роджер");

        Book book1 = new Book("Черновик", author1, 2006);
        Book book2 = new Book("Девять принцев Амбера", author2, 1970);

        book2.setYear(1971);

        System.out.println(book1.toString());
        System.out.println(book1.equals(book1));
        System.out.println(book1.equals(book2));
        System.out.println(author1.equals(author1));
        System.out.println(book1.hashCode() == book2.hashCode());

        System.out.println(book1.hashCode());
        System.out.println(author1.hashCode());

    }

}
