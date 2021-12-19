package ua.com.zinchenko.carzar.service;

import ua.com.zinchenko.carzar.model.Advertisement;

import java.util.List;

public interface AdvertisementService {

    void createAdvertisement(Advertisement advertisement);
    void removeAdvertisement(Advertisement advertisement);
    Advertisement getById(Integer id);
    List<Advertisement> getAll();
}
