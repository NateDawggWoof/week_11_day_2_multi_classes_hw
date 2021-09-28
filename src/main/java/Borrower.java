import java.util.ArrayList;

public class Borrower {

    private String name;
    private  Integer capacity;
    private ArrayList<Book> stock;

    public Borrower(String name, Integer capacity){
        this.name = name;
        this.capacity = capacity;
        this.stock = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int countStock() {
        return this.stock.size();
    }

    public boolean canBorrow() {
        return this.countStock() < this.getCapacity();
    }

    public void addBook(Book book) {
        this.stock.add(book);
    }
}

