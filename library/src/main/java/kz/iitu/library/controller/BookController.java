package kz.iitu.library.controller;

import kz.iitu.library.model.Books;
import kz.iitu.library.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    IBookService service;

    @PostMapping("/create")
    public void create(@RequestBody Books books){
        service.create(books);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable(name = "id") Integer id){
        service.delete(id);
    }

    @PostMapping("/update/{id}/")
    public void update(@PathVariable(name = "id") Integer id, @RequestBody Books book){
        service.update(id, book);
    }

    @GetMapping("/available/all")
    public List<Books> getAllAvailableBooks(){
        return service.getAllAvailableBooks();
    }

    @GetMapping("/issue/all")
    public List<Books> getAllIssueBooks(){
        return service.getAllIssueBooks();
    }

    @GetMapping("/find/name/")
    public List<Books> getBooksByName(@RequestParam(name = "name") String name){
        return service.getAllByName(name);
    }

    @GetMapping("/find/author/")
    public List<Books> getBooksByAuthor(@RequestParam(name = "author") String author){
        return service.getAllByAuthor(author);
    }

    @GetMapping("/find/isbn/")
    public Books getBookByIsbn(@RequestParam(name = "isbn") String s){
        return service.getByIsbnNumber(s);
    }
}
