package ua.com.zinchenko.carzar.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @Column(name = "user_id")
    private Integer id;

    @Column(name = "user_first_name")
    private String firstName;

    @Column(name = "user_second_name")
    private String secondName;

    @Column(name = "user_email")
    private String firstEmail;

    @Column(name = "password")
    private String password;

    @Column(name = "phone_number")
    private String phoneNumber;

    @OneToMany(mappedBy = "user")
    private Set<Advertisement> advertisementSet;

    @ManyToMany
    @JoinTable(
            name = "user_roles",
            joinColumns = { @JoinColumn(name = "user_id") },
            inverseJoinColumns = { @JoinColumn(name = "role_id") }
    )
    Set<Role> roles = new HashSet<>();
}
