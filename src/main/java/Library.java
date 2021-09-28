import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private Integer capacity;
    private ArrayList<Book> stock;
    private HashMap<String, Integer> genres;

    public Library(Integer capacity){
        this.capacity = capacity;
        this.stock = new ArrayList<>();
        genres = new HashMap<>();
    }

    public Object getCapacity() {
        return this.capacity;
    }

    public void addBook(Book book) {
        this.stock.add(book);
        this.addToGenreCollection(book);
    }

    public int countStock() {
        return this.stock.size();
    }

    public Book removeBook() {
        return this.stock.remove(0);
    }

    public void checkOutBook(Borrower borrower) {
        if(borrower.canBorrow()){
            Book book = this.removeBook();
            borrower.addBook(book);
        }
    }

    private void addToGenreCollection(Book book){
        if (this.genres.containsKey(book.getGenre())){
            Integer currentValue = this.genres.get(book.getGenre());
            this.genres.put(book.getGenre(), currentValue + 1);
        } else {
            this.genres.put(book.getGenre(), 1);
        }
    }

    public int countGenres(String genre){
        return genres.get(genre);
    }
}
