package liviadesu.biblioteca.api;

import liviadesu.biblioteca.model.Book;

import java.util.List;

public interface BookService {
    Book add(String title, String author);
    List<Book> getAll();
//    List<Book> findA();
}
