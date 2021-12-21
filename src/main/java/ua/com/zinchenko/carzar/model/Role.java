package ua.com.zinchenko.carzar.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "roles")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Role {

    @Id
    @Column(name = "role_id")
    @GeneratedValue
    private Integer id;

    @Column(name = "role_name")
    private String RoleName;

    @ManyToMany(mappedBy = "roles")
    private Set<User> users = new HashSet<>();
}

