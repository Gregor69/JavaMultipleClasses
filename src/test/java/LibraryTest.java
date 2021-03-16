import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;
    Book book1;
    Book book2;
    Book book3;
    Book book4;
    Book book5;

    @Before
    public void setUp(){
        library = new Library(2000);
        book = new Book();
        book1 = new Book();
        book2 = new Book();
        book3 = new Book();
        book4 = new Book();
        book4 = new Book();
        book5 = new Book();
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
}

