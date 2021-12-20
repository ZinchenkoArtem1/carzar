package ua.com.zinchenko.carzar.api;

import org.springframework.web.bind.annotation.*;
import ua.com.zinchenko.carzar.api.dto.AdvertisementDto;
import ua.com.zinchenko.carzar.api.mapper.AdvertisementMapper;
import ua.com.zinchenko.carzar.model.Advertisement;
import ua.com.zinchenko.carzar.service.AdvertisementService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/advertisements/v1")
public class AdvertisementController {

    private final AdvertisementService advertisementService;

    public AdvertisementController(AdvertisementService advertisementService) {
        this.advertisementService = advertisementService;
    }

    @GetMapping("/{id}")
    public AdvertisementDto getAdvertisement(@PathVariable Integer id) {
        return AdvertisementMapper.modelToDto(advertisementService.getById(id));
    }

    @GetMapping
    public List<AdvertisementDto> getAdvertisements() {
        return advertisementService.getAll().stream()
                .map(AdvertisementMapper::modelToDto)
                .collect(Collectors.toList());
    }

    @PostMapping
    public void createAdvertisement(@RequestBody Advertisement advertisement) {
        advertisementService.createAdvertisement(advertisement);
    }

    @DeleteMapping
    public void deleteAdvertisement(@RequestBody Advertisement advertisement) {
        advertisementService.removeAdvertisement(advertisement);
    }
}
