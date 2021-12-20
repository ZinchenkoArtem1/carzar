package ua.com.zinchenko.carzar.api.mapper;

import ua.com.zinchenko.carzar.api.dto.BodyTypeDto;
import ua.com.zinchenko.carzar.api.dto.CarModelDto;
import ua.com.zinchenko.carzar.model.BodyType;
import ua.com.zinchenko.carzar.model.CarModel;

public class BodyTypeMapper {

    public static BodyTypeDto modelToDto(BodyType bodyType) {
        return new BodyTypeDto(bodyType.getId(), bodyType.getName());
    }
}
