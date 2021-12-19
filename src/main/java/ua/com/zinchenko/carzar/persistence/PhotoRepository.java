package ua.com.zinchenko.carzar.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.com.zinchenko.carzar.model.Photo;
import ua.com.zinchenko.carzar.model.User;

@Repository
public interface PhotoRepository extends JpaRepository<Photo, Integer> {
}
