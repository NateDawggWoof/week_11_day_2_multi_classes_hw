import java.util.ArrayList;

public class Library {

    private Integer capacity;
    private ArrayList<Book> stock;

    public Library(Integer capacity){
        this.capacity = capacity;
        this.stock = new ArrayList<>();
    }

    public Object getCapacity() {
        return this.capacity;
    }

    public void addBook(Book book) {
        this.stock.add(book);
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
}
