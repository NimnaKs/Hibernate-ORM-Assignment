package lk.ijse.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.time.Year;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

@Entity
public class Book {

    @Id
    private String book_id;
    private String title;
    private String isbn;
    private Year publication_year;
    private String publisher;
    private String language;
    private int total_copies;
    @ManyToMany
    private List<Author> authorList;

}
