package ua.com.zinchenko.carzar.service;

import ua.com.zinchenko.carzar.model.CarModel;
import ua.com.zinchenko.carzar.model.CarType;

import java.util.List;

public interface CarModelService {

    List<CarModel> getAllCarModels();

    List<CarModel> getCarModelsByCarType(CarType carType);
}
