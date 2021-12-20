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

    @ManyToOne
    @JoinColumn(name = "car_type_id")
    private CarType carType;

    @OneToMany(mappedBy = "carModel")
    private Set<Car> cars;
}
