package ua.com.zinchenko.carzar.service;

import ua.com.zinchenko.carzar.model.BodyType;
import ua.com.zinchenko.carzar.model.CarModel;
import ua.com.zinchenko.carzar.model.CarType;

import java.util.List;

public interface BodyTypeService {

    List<BodyType> getBodyTypesByCarType(CarType carType);
}
