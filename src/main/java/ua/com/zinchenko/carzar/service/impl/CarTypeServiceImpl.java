package ua.com.zinchenko.carzar.service.impl;

import org.springframework.stereotype.Service;
import ua.com.zinchenko.carzar.model.CarType;
import ua.com.zinchenko.carzar.persistence.CarTypeRepository;
import ua.com.zinchenko.carzar.service.CarTypeService;

import java.util.List;

@Service
public class CarTypeServiceImpl implements CarTypeService {

    private final CarTypeRepository carTypeRepository;

    public CarTypeServiceImpl(CarTypeRepository carTypeRepository) {
        this.carTypeRepository = carTypeRepository;
    }

    @Override
    public List<CarType> getAllCarTypes() {
        return carTypeRepository.findAll();
    }
}
