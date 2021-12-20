package ua.com.zinchenko.carzar.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.com.zinchenko.carzar.api.dto.CarTypeDto;
import ua.com.zinchenko.carzar.api.mapper.CarTypeMapper;
import ua.com.zinchenko.carzar.model.CarType;
import ua.com.zinchenko.carzar.service.CarTypeService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/cartypes/v1")
public class CarTypeController {

    private final CarTypeService carTypeService;

    public CarTypeController(CarTypeService carTypeService) {
        this.carTypeService = carTypeService;
    }

    @GetMapping
    public List<CarTypeDto> getAllCarTypes() {
        return carTypeService.getAllCarTypes().stream()
                .map(CarTypeMapper::modelToDto)
                .collect(Collectors.toList());
    }
}
