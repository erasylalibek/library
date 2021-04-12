package kz.iitu.library.controller;

import kz.iitu.library.model.Books;
import kz.iitu.library.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    IBookService service;

    @RequestMapping(method = RequestMethod.POST)
    public void create(@RequestBody Books books){
        service.create(books);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Integer id){
        service.delete(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void update(@PathVariable(name = "id") Integer id,
                       @RequestParam(name = "status") Boolean status){
        service.update(id, status);
    }

    @RequestMapping(value = "/availables", method = RequestMethod.GET)
    public List<Books> getAllAvailableBooks(){
        return service.getAllAvailableBooks();
    }

    @RequestMapping(value = "/issues", method = RequestMethod.GET)
    public List<Books> getAllIssueBooks(){
        return service.getAllIssueBooks();
    }

    @RequestMapping(value = "/name", method = RequestMethod.GET)
    public List<Books> getBooksByName(@RequestParam(name = "name") String name){
        return service.getAllByName(name);
    }

    @RequestMapping(value = "/author", method = RequestMethod.GET)
    public List<Books> getBooksByAuthor(@RequestParam(name = "author") String author){
        return service.getAllByAuthor(author);
    }

    @RequestMapping(value = "/isbn", method = RequestMethod.GET)
    public Books getBookByIsbn(@RequestParam(name = "isbn") String s){
        return service.getByIsbnNumber(s);
    }
}
