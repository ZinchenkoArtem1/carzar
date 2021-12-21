package ua.com.zinchenko.carzar.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "car_types")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CarType {

    @Id
    @Column(name = "car_type_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "car_type_name")
    private String name;

    @OneToMany(mappedBy = "carType")
    private Set<BodyType> bodyTypes;

    @OneToMany(mappedBy = "carType")
    private Set<CarModel> carModels;

    @OneToMany(mappedBy = "carType")
    private Set<Car> cars;
}
