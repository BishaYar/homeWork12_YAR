public class Book {
    private String nameBook;
    private Author authorBook;
    int yearPublic;

    public Book(String nameBook, Author authorBook, int yearPublic) {
        this.nameBook = nameBook;
        this.authorBook = authorBook;
        this.yearPublic = yearPublic;
    }

    public String getNameBook(){
        return this.nameBook;
    }

    public Author getAuthorBook(){
        return this.authorBook;
    }

    public int getYearPublic(){
        return this.yearPublic;
    }

    public void setYearPublic(int yearPublic){
        this.yearPublic = yearPublic;
    }
}
