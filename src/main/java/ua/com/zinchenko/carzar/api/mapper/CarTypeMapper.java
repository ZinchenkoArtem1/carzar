package ua.com.zinchenko.carzar.api.mapper;

import ua.com.zinchenko.carzar.api.dto.CarTypeDto;
import ua.com.zinchenko.carzar.model.CarType;

public class CarTypeMapper {

    public static CarTypeDto modelToDto(CarType carType) {
        return new CarTypeDto(carType.getId(), carType.getName());
    }
}
