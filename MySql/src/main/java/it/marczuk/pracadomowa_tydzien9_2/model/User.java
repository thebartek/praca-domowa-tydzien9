package it.marczuk.pracadomowa_tydzien9_2.model;

import lombok.*;
import com.opencsv.bean.CsvBindByName;
import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CsvBindByName(column = "first_name")
    private String firstName;

    @CsvBindByName(column = "last_name")
    private String lastName;

    @CsvBindByName
    private String email;

    @CsvBindByName
    private String gender;

    @CsvBindByName(column = "ip_address")
    private String ipAddress;

    public User(String firstName, String lastName, String email, String gender, String ipAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.ipAddress = ipAddress;
    }
}
