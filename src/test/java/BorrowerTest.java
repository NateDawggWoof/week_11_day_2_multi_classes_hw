import org.junit.Before;
import org.junit.Test;

import java.nio.Buffer;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Library library;
    private Book book;

    @Before
    public void before() {
        library = new Library(5);
        book = new Book("1984", "George Orwell", "Dystopian");
        borrower = new Borrower("Steve", 2);

    }

    @Test
    public void hasNameCapacityStock(){
        assertEquals("Steve", borrower.getName());
        assertEquals(2, borrower.getCapacity());
        assertEquals(0, borrower.countStock());
    }


}
