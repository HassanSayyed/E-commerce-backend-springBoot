package com.backend.server.product.laptops;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/laptop")
public class LaptopController {

    private final LaptopService laptopService;
    @Autowired
    public LaptopController(LaptopService laptopService) {
        this.laptopService = laptopService;
    }

    @GetMapping
    public List<Laptop> getAllLaptops(){
        return laptopService.getAllLaptops();
    }
    @GetMapping(path="{laptopID}")
    public Optional<Laptop> getPhone(@PathVariable("laptopID") Long laptopID){
        return laptopService.getLaptop(laptopID);
    }

}
