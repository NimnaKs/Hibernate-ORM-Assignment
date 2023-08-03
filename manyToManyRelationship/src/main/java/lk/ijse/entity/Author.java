package lk.ijse.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

@Entity
public class Author {

    @Id
    private String author_id;
    private String f_name;
    private String l_name;
    private LocalDate dateOfBirth;
    private String country;
    private String biography;
    @ManyToMany(mappedBy = "authorList")
    private List<Book> bookList;

}
