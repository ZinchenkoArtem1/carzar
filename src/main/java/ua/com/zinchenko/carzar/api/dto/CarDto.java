package ua.com.zinchenko.carzar.api.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CarDto {

    private Integer id;
    private CarTypeDto carTypeDto;
    private CarModelDto carModelDto;
    private BodyTypeDto bodyTypeDto;
}
