package ua.com.zinchenko.carzar.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.com.zinchenko.carzar.model.BodyType;
import ua.com.zinchenko.carzar.model.CarModel;
import ua.com.zinchenko.carzar.model.CarType;
import ua.com.zinchenko.carzar.model.User;

import java.util.List;

@Repository
public interface BodyTypeRepository extends JpaRepository<BodyType, Integer> {

    List<BodyType> findBodyTypesByCarType(CarType carType);
}
