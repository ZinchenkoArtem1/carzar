package ua.com.zinchenko.carzar.api;

import org.springframework.web.bind.annotation.*;
import ua.com.zinchenko.carzar.model.Advertisement;
import ua.com.zinchenko.carzar.service.AdvertisementService;

import java.util.List;

@RestController
@RequestMapping("/advertisements/v1")
public class AdvertisementController {

    private final AdvertisementService advertisementService;

    public AdvertisementController(AdvertisementService advertisementService) {
        this.advertisementService = advertisementService;
    }

    @GetMapping("/{id}")
    public Advertisement getAdvertisement(@PathVariable Integer id) {
        return advertisementService.getById(id);
    }

    @GetMapping
    public List<Advertisement> getAdvertisements() {
        return advertisementService.getAll();
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
