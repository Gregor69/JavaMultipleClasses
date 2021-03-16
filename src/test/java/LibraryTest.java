import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;
    private Book book1;
    private Book book2;
    private Book book3;
    private Customer customer;


    @Before
    public void setUp(){
        library = new Library(2000);
        book = new Book();
        book1 = new Book();
        book2 = new Book();
        book3 = new Book();
        customer = new Customer ();
        customer.addBook(book);



    }

    @Test
    public void bookCountStartsAt0() {
        assertEquals(0, library.bookCount());
    }

    @Test
    public void countBooks() {
        library.addBook(book);
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(3, library.bookCount());
    }

    @Test
    public void addBook(){
        library.addBook(book);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void cantAddBook(){
        library.addBook(book);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(4, library.bookCount());
    }

    @Test
    public void loanBookToCustomer(){
        library.addBook(book);
        library.addBook(book1);
        library.loanBook(book);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void returnBookFromCustomer(){
        library.returnBook(book);
        assertEquals(1, library.bookCount());
    }
}

