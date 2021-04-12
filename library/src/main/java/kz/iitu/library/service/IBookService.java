package kz.iitu.library.service;

import kz.iitu.library.model.Books;

import java.util.List;

public interface IBookService {
    void create(Books book);
    void update(Integer id, Boolean status);
    void delete(Integer id);
    List<Books> getAllAvailableBooks();
    List<Books> getAllIssueBooks();
    List<Books> getAllByName(String name);
    List<Books> getAllByAuthor(String author);
    Books getByIsbnNumber(String s);

}
