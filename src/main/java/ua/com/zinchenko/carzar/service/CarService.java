package ua.com.zinchenko.carzar.service;

import ua.com.zinchenko.carzar.model.BodyType;
import ua.com.zinchenko.carzar.model.Car;
import ua.com.zinchenko.carzar.model.CarModel;
import ua.com.zinchenko.carzar.model.CarType;

public interface CarService {

    Car getCar(CarModel carModel, BodyType bodyType);
}
