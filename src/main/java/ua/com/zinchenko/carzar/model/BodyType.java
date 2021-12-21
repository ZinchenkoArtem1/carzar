package ua.com.zinchenko.carzar.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "body_types")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BodyType {

    @Id
    @Column(name = "body_type_id")
    @GeneratedValue
    private Integer id;

    @Column(name = "body_type_name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "car_type_id")
    private CarType carType;

    @OneToMany(mappedBy = "bodyType")
    private Set<Car> cars;
}
