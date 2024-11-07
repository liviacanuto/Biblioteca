package liviadesu.biblioteca.repository;

import liviadesu.biblioteca.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IBookRepository extends JpaRepository<Book, Long> {
    List<Book> findByAuthor(String author);
}
