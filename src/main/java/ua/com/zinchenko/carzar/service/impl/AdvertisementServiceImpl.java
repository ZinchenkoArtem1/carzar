package ua.com.zinchenko.carzar.service.impl;

import org.springframework.stereotype.Service;
import ua.com.zinchenko.carzar.model.Advertisement;
import ua.com.zinchenko.carzar.persistence.AdvertisementRepository;
import ua.com.zinchenko.carzar.service.AdvertisementService;

import java.util.List;

@Service
public class AdvertisementServiceImpl implements AdvertisementService {

    private final AdvertisementRepository advertisementRepository;

    public AdvertisementServiceImpl(AdvertisementRepository advertisementRepository) {
        this.advertisementRepository = advertisementRepository;
    }

    @Override
    public void createAdvertisement(Advertisement advertisement) {
        advertisementRepository.save(advertisement);
    }

    @Override
    public void removeAdvertisement(Advertisement advertisement) {
        advertisementRepository.delete(advertisement);
    }

    @Override
    public Advertisement getById(Integer id) {
        return advertisementRepository.getById(id);
    }

    @Override
    public List<Advertisement> getAll() {
        return advertisementRepository.findAll();
    }
}
