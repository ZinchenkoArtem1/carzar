package ua.com.zinchenko.carzar.api.mapper;

import ua.com.zinchenko.carzar.api.dto.CarDto;
import ua.com.zinchenko.carzar.model.Car;

public class CarMapper {

    public static CarDto modelToDto(Car car) {
        return new CarDto(
                car.getId(),
                CarTypeMapper.modelToDto(car.getCarType()),
                CarModelMapper.modelToDto(car.getCarModel()),
                BodyTypeMapper.modelToDto(car.getBodyType())
        );
    }
}
