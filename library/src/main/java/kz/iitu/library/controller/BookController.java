package kz.iitu.library.controller;

import kz.iitu.library.model.Books;
import kz.iitu.library.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    IBookService service;

    public void create(Books books){
        service.create(books);
    }
    public void delete(Integer id){
        service.delete(id);
    }
    public void update(Integer id, Books book){
        service.update(id, book);
    }
    public List<Books> getAllAvailableBooks(){
        return service.getAllAvailableBooks();
    }
    public List<Books> getAllIssueBooks(){
        return service.getAllIssueBooks();
    }
    public List<Books> getBooksByName(String name){
        return service.getAllByName(name);
    }
    public List<Books> getBooksByAuthor(String author){
        return service.getAllByAuthor(author);
    }
    public Books getBookByIsbn(String s){
        return service.getByIsbnNumber(s);
    }
}
