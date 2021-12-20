package ua.com.zinchenko.carzar.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.com.zinchenko.carzar.api.dto.CarDto;
import ua.com.zinchenko.carzar.api.mapper.CarMapper;
import ua.com.zinchenko.carzar.model.BodyType;
import ua.com.zinchenko.carzar.model.Car;
import ua.com.zinchenko.carzar.model.CarModel;
import ua.com.zinchenko.carzar.service.CarService;

@RestController
@RequestMapping("/cars/v1")
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @PostMapping("/carmodel/bodytype")
    public CarDto getCarByModelAndBody(@RequestBody CarModel carModel, @RequestBody BodyType bodyType) {
        return CarMapper.modelToDto(carService.getCar(carModel, bodyType));
    }
}
