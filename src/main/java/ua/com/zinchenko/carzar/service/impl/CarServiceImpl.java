package ua.com.zinchenko.carzar.service.impl;

import org.springframework.stereotype.Service;
import ua.com.zinchenko.carzar.model.BodyType;
import ua.com.zinchenko.carzar.model.Car;
import ua.com.zinchenko.carzar.model.CarModel;
import ua.com.zinchenko.carzar.persistence.CarRepository;
import ua.com.zinchenko.carzar.service.CarService;

@Service
public class CarServiceImpl implements CarService {

    private final CarRepository carRepository;

    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public Car getCar(CarModel carModel, BodyType bodyType) {
        return carRepository.findByCarModelAndBodyType(carModel, bodyType);
    }
}
