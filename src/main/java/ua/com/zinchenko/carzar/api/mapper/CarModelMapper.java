package ua.com.zinchenko.carzar.api.mapper;

import ua.com.zinchenko.carzar.api.dto.CarModelDto;
import ua.com.zinchenko.carzar.api.dto.CarTypeDto;
import ua.com.zinchenko.carzar.model.CarModel;
import ua.com.zinchenko.carzar.model.CarType;

public class CarModelMapper {

    public static CarModelDto modelToDto(CarModel carModel) {
        return new CarModelDto(carModel.getId(), carModel.getName());
    }
}
