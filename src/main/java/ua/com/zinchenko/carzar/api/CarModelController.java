package ua.com.zinchenko.carzar.api;

import org.springframework.web.bind.annotation.*;
import ua.com.zinchenko.carzar.api.dto.CarModelDto;
import ua.com.zinchenko.carzar.api.mapper.CarModelMapper;
import ua.com.zinchenko.carzar.model.Advertisement;
import ua.com.zinchenko.carzar.model.CarModel;
import ua.com.zinchenko.carzar.model.CarType;
import ua.com.zinchenko.carzar.service.CarModelService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/carmodels/v1")
public class CarModelController {

    private final CarModelService carModelService;

    public CarModelController(CarModelService carModelService) {
        this.carModelService = carModelService;
    }

    @GetMapping
    public List<CarModel> getAllCarModels() {
        return carModelService.getAllCarModels();
    }

    @PostMapping("/cartype")
    public List<CarModelDto> getCarModelsByCarType(@RequestBody CarType carType) {
        return carModelService.getCarModelsByCarType(carType).stream()
                .map(CarModelMapper::modelToDto)
                .collect(Collectors.toList());
    }

}
