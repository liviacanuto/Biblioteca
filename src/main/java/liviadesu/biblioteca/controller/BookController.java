package liviadesu.biblioteca.controller;

import liviadesu.biblioteca.model.Book;
import liviadesu.biblioteca.api.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {
    private int bla = 10;
    @Autowired
    private BookService bookService;
    @RequestMapping(value={"/home"})
    public String home() {
        return "Welcome to Biblioteca!";
    }

    @RequestMapping(value={"/add"})
    public String add() {
        Book book = this.bookService.add("livia", "desu" + bla++);
        return book.toString();
    }

    @RequestMapping(value = {"/find"})
    public String find() {
        List<Book> books = this.bookService.getAll();
        return books.toString();
    }

//    @RequestMapping(value = {"/findA"})
//    public String findA() {
//        List<Book> books = this.bookService.findA();
//        return books.toString();
//    }
}
