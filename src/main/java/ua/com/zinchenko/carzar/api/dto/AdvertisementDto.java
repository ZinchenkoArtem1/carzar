package ua.com.zinchenko.carzar.api.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AdvertisementDto {

    private Integer id;
    private String description;
    private Integer price;
    private UserDto userDto;
    private String color;
    private Integer mileage;
    private CarDto carDto;
}
