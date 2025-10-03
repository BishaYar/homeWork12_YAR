//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Author author_1 = new Author("Sergeev", "Petr");
        Author author_2 = new Author("Ivanov", "Oleg");

        Book book_1 = new Book("Legenda", author_1, 1999);
        Book book_2 = new Book("Moda", author_2, 2025);

        //System.out.println("Книга: " + book_1.getNameBook() + ", автор: " + book_1.getAuthorBook().getLastName() + " " + book_1.getAuthorBook().getFirstname() + ", год издания: " + book_1.getYearPublic());
        //System.out.println("Книга: " + book_2.getNameBook() + ", автор: " + book_2.getAuthorBook().getLastName() + " " + book_2.getAuthorBook().getFirstname() + ", год издания: " + book_2.getYearPublic());

        book_1.setYearPublic(2020);

        //System.out.println("Книга: " + book_1.getNameBook() + ", автор: " + book_1.getAuthorBook().getLastName() + " " + book_1.getAuthorBook().getFirstname() + ", год издания: " + book_1.getYearPublic());
    }
}