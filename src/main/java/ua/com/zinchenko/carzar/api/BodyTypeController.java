package ua.com.zinchenko.carzar.api;

import org.springframework.web.bind.annotation.*;
import ua.com.zinchenko.carzar.api.dto.BodyTypeDto;
import ua.com.zinchenko.carzar.api.mapper.BodyTypeMapper;
import ua.com.zinchenko.carzar.model.BodyType;
import ua.com.zinchenko.carzar.model.CarType;
import ua.com.zinchenko.carzar.service.BodyTypeService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/bodytypes/v1")
public class BodyTypeController {

    private final BodyTypeService bodyTypeService;

    public BodyTypeController(BodyTypeService bodyTypeService) {
        this.bodyTypeService = bodyTypeService;
    }

    @PostMapping("/cartype")
    public List<BodyTypeDto> getBodyTypesByCarType(@RequestBody CarType carType) {
        return bodyTypeService.getBodyTypesByCarType(carType).stream()
                .map(BodyTypeMapper::modelToDto)
                .collect(Collectors.toList());
    }
}
