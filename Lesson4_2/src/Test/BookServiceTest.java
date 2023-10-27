package Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Book.Book;
import Book.BookRepository;
import Book.BookService;
import Book.InMemoryBookRepository;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BookServiceTest {
    /*
     * У вас есть класс BookService, который использует интерфейс BookRepository для получения
     * информации о книгах из базы данных. Ваша задача написать unit-тесты для BookService, используя
     * Mockito для создания мок-объекта BookRepository.
     */
    
    private BookRepository bookRepository;
    private BookService bookService;
    
    @BeforeEach
    public void setUp() {
        bookRepository = mock(InMemoryBookRepository.class);
        bookService = new BookService(bookRepository);
    }

    @Test
    public void checkFindBookById() {
        Book book1 = new Book("1", "Book1", "Author1");
        when(bookRepository.findById("1")).thenReturn(book1);

        Book book2 = bookService.findBookById("1");

        assertThat(book1).isEqualTo(book2);
        verify(bookRepository, times(1)).findById("1");
    }


    @Test
    public void checkFindAllBooks() {
        Book book1 = new Book("1", "Book1", "Author1");
        Book book2 = new Book("2", "Book2", "Author2");

        List<Book> listBooks1 = new ArrayList<>(List.of(book1, book2));
        when(bookRepository.findAll()).thenReturn(listBooks1);

        List<Book> listBooks2 = bookService.findAllBooks();
        
        assertThat(listBooks1).isEqualTo(listBooks2);
        verify(bookRepository, times(1)).findAll();
    }
}