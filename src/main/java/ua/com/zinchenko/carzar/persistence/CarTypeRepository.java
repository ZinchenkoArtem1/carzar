package ua.com.zinchenko.carzar.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.com.zinchenko.carzar.model.CarType;
import ua.com.zinchenko.carzar.model.User;

@Repository
public interface CarTypeRepository extends JpaRepository<CarType, Integer> {
}
