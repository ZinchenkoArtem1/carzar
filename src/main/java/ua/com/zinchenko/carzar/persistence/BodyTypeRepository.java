package ua.com.zinchenko.carzar.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.com.zinchenko.carzar.model.BodyType;
import ua.com.zinchenko.carzar.model.User;

@Repository
public interface BodyTypeRepository extends JpaRepository<BodyType, Integer> {
}
