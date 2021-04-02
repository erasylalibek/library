package kz.iitu.library.model;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "library")
@Component
public class Library {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer library_id;

    private String name;
    private String country;

    @OneToMany(mappedBy = "library")
    private List<Books> books;

    @Override
    public String toString() {
        return "Library{" +
                "library_id=" + library_id +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
