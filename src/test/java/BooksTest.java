import org.junit.Before;
import org.junit.Test;

import java.awt.print.Book;

import static org.junit.Assert.assertEquals;

public class BooksTest {

    Books books;
//    Title title;
//    Author author;
//    Genre genre;

    @Before
    public void setUp() {
          books = new Books(30);
//          title = new Title("Harry Potter");
//        author = new Author("Jk Rowling");
//        genre = new Genre("Fantasy");
    }


    @Test
    public void hasCapacity() {
        assertEquals(30, books.getCapacity());
    }

    @Test
    public void libraryIsEmpty() {
        assertEquals(0, books.getBooksInLibrary());
    }

    @Test
    public void addOneBookToLibrary() {
        books.add(books);
        assertEquals(1, books.getBooksInLibrary());
    }

    @Test
    public void addTooManyBooks() {
        Books smallLibrary = new Books(3);
        smallLibrary.add(books);
        smallLibrary.add(books);
        smallLibrary.add(books);
        smallLibrary.add(books);
        assertEquals(3, smallLibrary.getBooksInLibrary());
    }


    }

