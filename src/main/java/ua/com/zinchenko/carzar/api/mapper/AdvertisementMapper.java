package ua.com.zinchenko.carzar.api.mapper;

import ua.com.zinchenko.carzar.api.dto.AdvertisementDto;
import ua.com.zinchenko.carzar.model.Advertisement;

public class AdvertisementMapper {

    public static AdvertisementDto modelToDto(Advertisement advertisement) {
        return new AdvertisementDto(
                advertisement.getId(),
                advertisement.getDescription(),
                advertisement.getPrice(),
                UserMapper.modelToDto(advertisement.getUser()),
                advertisement.getColor(),
                advertisement.getMileage(),
                CarMapper.modelToDto(advertisement.getCar())
        );
    }
}
