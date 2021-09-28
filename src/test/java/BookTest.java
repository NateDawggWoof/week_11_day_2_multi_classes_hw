import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void before(){
        book = new Book("1984","George Orwell","Dystopian");
    }

    @Test
    public void hasBookTitleAuthorGenre(){
        assertEquals("1984", book.getTitle());
        assertEquals("George Orwell", book.getAuthor());
        assertEquals("Dystopian", book.getGenre());

    }
}
