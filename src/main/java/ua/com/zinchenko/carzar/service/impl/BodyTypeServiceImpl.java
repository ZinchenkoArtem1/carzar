package ua.com.zinchenko.carzar.service.impl;

import org.springframework.stereotype.Service;
import ua.com.zinchenko.carzar.model.BodyType;
import ua.com.zinchenko.carzar.model.CarModel;
import ua.com.zinchenko.carzar.model.CarType;
import ua.com.zinchenko.carzar.persistence.BodyTypeRepository;
import ua.com.zinchenko.carzar.service.BodyTypeService;

import java.util.List;

@Service
public class BodyTypeServiceImpl implements BodyTypeService {

    private final BodyTypeRepository bodyTypeRepository;

    public BodyTypeServiceImpl(BodyTypeRepository bodyTypeRepository) {
        this.bodyTypeRepository = bodyTypeRepository;
    }

    @Override
    public List<BodyType> getBodyTypesByCarType(CarType carType) {
        return bodyTypeRepository.findBodyTypesByCarType(carType);
    }
}
