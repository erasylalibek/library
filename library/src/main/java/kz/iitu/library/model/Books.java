package kz.iitu.library.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Data
@Table(name = "books")
@Component
public class Books {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer book_id;

    private String name;
    private String author;
    private String isbn;
    private Boolean status;
    private Integer library_id;
    private Integer user_id;

    @ManyToOne
    @JoinColumn(name = "user_id", insertable = false, updatable = false)
    @Getter(AccessLevel.NONE)
    private User user;

    @ManyToOne
    @JoinColumn(name = "library_id", insertable = false, updatable = false)
    @Getter(AccessLevel.NONE)
    private Library library;

    @Override
    public String toString() {
        return "Books{" +
                "book_id=" + book_id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", status=" + status +
                ", library_id=" + library_id +
                ", user_id=" + user_id +
                '}';
    }
}
