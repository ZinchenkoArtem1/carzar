package ua.com.zinchenko.carzar.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.com.zinchenko.carzar.model.CarModel;
import ua.com.zinchenko.carzar.model.CarType;
import ua.com.zinchenko.carzar.model.User;

import java.util.List;

@Repository
public interface CarModelRepository extends JpaRepository<CarModel, Integer> {

    List<CarModel> findCarModelByCarType(CarType carType);
}
