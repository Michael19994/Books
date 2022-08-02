import java.util.ArrayList;

public class Books {
    private ArrayList<Books> books;
    private int capacity;
    private String title;
    private String author;
    private String genre;


    public Books(int capacity) {
        this.books = new ArrayList<Books>();
//        this.title = title;
//        this.author = author;
//        this.genre = genre;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getBooksInLibrary() {
        return this.books.size();
    }

    public void add(Books books) {
        if (capacity > books.books.size()) {
            this.books.add(books);
        }
    }
}

