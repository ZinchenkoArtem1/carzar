package ua.com.zinchenko.carzar.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.com.zinchenko.carzar.model.Advertisement;
import ua.com.zinchenko.carzar.model.User;

@Repository
public interface AdvertisementRepository extends JpaRepository<Advertisement, Integer> {
}
