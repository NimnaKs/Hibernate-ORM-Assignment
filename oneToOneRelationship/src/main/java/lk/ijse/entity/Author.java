package lk.ijse.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;

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

}
