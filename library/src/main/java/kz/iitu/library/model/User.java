package kz.iitu.library.model;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "users")
@Component
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer user_id;

    private String name;
    private String username;
    private String password;

    @OneToMany(mappedBy = "user")
    private List<Books> books;

    @Override
    public String toString() {
        return "Users{" +
                "user_id=" + user_id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
