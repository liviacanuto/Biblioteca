package liviadesu.biblioteca.service;

import liviadesu.biblioteca.model.Book;
import liviadesu.biblioteca.repository.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookService implements liviadesu.biblioteca.api.BookService {
    @Autowired
    private IBookRepository bookRepository;

    @Override
    public Book add(String title, String author) {
        Book book = this.bookRepository.save(new Book(title, author));
        System.out.println("Livro criado com sucesso!\n" + book);
        return book;
    }

    @Override
    public List<Book> getAll() {
        List<Book> books = this.bookRepository.findAll();
        return books;
    }

//    @Override
//    public List<Book> findA() {
//        return this.bookRepository.findByAuthor("desu20");
//    }
}
