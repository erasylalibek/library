package kz.iitu.library.repository;

import kz.iitu.library.model.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Books, Integer> {
    List<Books> getAllByStatusIsFalse();
    List<Books> getAllByStatusIsTrue();
    List<Books> getAllByName(String name);
    List<Books> getAllByAuthor(String author);
    Books getByIsbn(String isbn);
}
