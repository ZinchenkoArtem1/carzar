package ua.com.zinchenko.carzar.service.impl;

import org.springframework.stereotype.Service;
import ua.com.zinchenko.carzar.model.CarModel;
import ua.com.zinchenko.carzar.model.CarType;
import ua.com.zinchenko.carzar.persistence.CarModelRepository;
import ua.com.zinchenko.carzar.service.CarModelService;

import java.util.List;

@Service
public class CarModelServiceImpl implements CarModelService {

    private final CarModelRepository carModelRepository;

    public CarModelServiceImpl(CarModelRepository carModelRepository) {
        this.carModelRepository = carModelRepository;
    }

    @Override
    public List<CarModel> getAllCarModels() {
        return carModelRepository.findAll();
    }

    @Override
    public List<CarModel> getCarModelsByCarType(CarType carType) {
        return carModelRepository.findCarModelByCarType(carType);
    }
}
