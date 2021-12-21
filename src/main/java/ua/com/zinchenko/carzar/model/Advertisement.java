package ua.com.zinchenko.carzar.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "advertisements")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Advertisement {

    @Id
    @Column(name = "advertisement_id")
    @GeneratedValue
    private Integer id;

    @Column(name = "advertisement_description")
    private String description;

    @Column(name = "price")
    private Integer price;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "color")
    private String color;

    @Column(name = "mileage")
    private Integer mileage;

    @ManyToOne
    @JoinColumn(name = "car_id")
    private Car car;

    @OneToMany(mappedBy = "advertisement")
    private Set<Photo> photos;
}
