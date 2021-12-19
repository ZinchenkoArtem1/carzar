package ua.com.zinchenko.carzar.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "car_models")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CarModel {

    @Id
    @Column(name = "car_model_id")
    private Integer id;

    @Column(name = "car_model_name")
    private String name;

    @ManyToMany
    @JoinTable(
            name = "car_type_car_model_matchers",
            joinColumns = { @JoinColumn(name = "car_model_id") },
            inverseJoinColumns = { @JoinColumn(name = "car_type_id") }
    )
    Set<CarType> carTypes = new HashSet<>();

    @OneToMany(mappedBy = "carModel")
    private Set<Car> cars;
}
