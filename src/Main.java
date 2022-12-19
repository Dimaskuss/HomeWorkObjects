import java.time.Year;

class Book {

    String bookName;
    Author bookAuthor;
    int bookYear;


    public Book(String bookName, Author bookAuthor, int bookYear) {
        this.bookName = bookName;
        this.bookYear = bookYear;
        this.bookAuthor = bookAuthor;

    }

    public String getBookName() {
        return bookName;
    }

    public int getBookYear() {
        return this.bookYear;
    }

    public void setBookYear(int bookYear) {
        this.bookYear = bookYear;
    }
}

class Author {
    String authorFirstName;
    String authorMiddleName;
    String authorLastName;


    public Author(String authorFirstName, String authorMiddleName, String authorLastName) {
        this.authorFirstName = authorFirstName;
        this.authorMiddleName = authorMiddleName;
        this.authorLastName = authorLastName;

    }


    public String getAuthorFirstName() {
        return this.authorFirstName;
    }

    public String getAuthorMiddleName() {
        return this.authorMiddleName;
    }

    public String getAuthorLastName() {
        return this.authorLastName;
    }


}


public class Main {

    public static void main(String[] args) {


        Author tolstoy = new Author("Лев", "Николаевич", "Толстой");
        Author chehov = new Author("Антон", "Павлович", "Чехов");
        Book sadCherry = new Book("Вишневый сад", chehov, 1904);
        Book warAndPeace = new Book("Война и Мир", tolstoy, 1867);
        System.out.println("sadCherry.bookYear = " + sadCherry.bookYear);
        sadCherry.setBookYear(1970);
        System.out.println("sadCherry.bookYear = " + sadCherry.bookYear);
        System.out.println("warAndPeace = " + tolstoy.authorMiddleName);
    }
}