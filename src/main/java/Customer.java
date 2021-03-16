import java.util.ArrayList;

public class Customer {

    private ArrayList<Book> book;

    public Customer(){
        this.book = new ArrayList<>();
    }

    public void addBook(Book book){
        this.book.add(book);
    }

    public int bookCount() {
        return this.book.size();
    }
}
