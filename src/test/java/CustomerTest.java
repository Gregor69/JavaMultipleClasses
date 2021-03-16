import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    private Customer customer;
    private Book book;

    @Before
    public void before(){
        customer = new Customer();
        book = new Book();
    }

    @Test
    public void addBook(){
        customer.addBook(book);
        assertEquals(1, customer.bookCount());

    }
}
