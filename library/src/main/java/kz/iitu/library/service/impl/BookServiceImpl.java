package kz.iitu.library.service.impl;

import kz.iitu.library.model.Books;
import kz.iitu.library.repository.BookRepository;
import kz.iitu.library.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements IBookService {

    @Autowired
    BookRepository repository;

    @Override
    public void create(Books book) {
        repository.save(book);
    }

    @Override
    public void update(Integer id, Books book) {
        Optional<Books> optionalBook = repository.findById(id);
        if(optionalBook.isPresent()){
            Books dbBook = optionalBook.get();
            dbBook.setStatus(book.getStatus());
            repository.save(dbBook);
        }
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public List<Books> getAllAvailableBooks() {
        return repository.getAllByStatusIsFalse();
    }

    @Override
    public List<Books> getAllIssueBooks() {
        return repository.getAllByStatusIsTrue();
    }

    @Override
    public List<Books> getAllByName(String name) {
        return repository.getAllByName(name);
    }

    @Override
    public List<Books> getAllByAuthor(String author) {
        return repository.getAllByAuthor(author);
    }

    @Override
    public Books getByIsbnNumber(String s) {
        return repository.getByIsbn(s);
    }

    @Override
    public Books getById(Integer id) {
        return repository.findByBook_id(id);
    }
}
