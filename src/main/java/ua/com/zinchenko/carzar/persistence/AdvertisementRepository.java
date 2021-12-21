package ua.com.zinchenko.carzar.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ua.com.zinchenko.carzar.model.Advertisement;
import ua.com.zinchenko.carzar.model.User;

import java.util.List;

@Repository
public interface AdvertisementRepository extends JpaRepository<Advertisement, Integer> {

    @Query(nativeQuery = true,
            value = "SELECT * FROM advertisements A" +
                    " WHERE A.user_id = :userId")
    List<Advertisement> findAllByUserId(Integer userId);
}
