package com.backend.server.product.phone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/phone")
public class PhoneController {


    private final PhoneService phoneService;

    @Autowired
    public PhoneController(PhoneService phoneService) {
        this.phoneService = phoneService;
    }

    @GetMapping
    public List<Phone> getAllPhones(){
        return phoneService.getAllPhones();
    }

    @GetMapping(path="{phoneID}")
    public Optional<Phone> getPhone(@PathVariable("phoneID") Long phoneID){
       return phoneService.getPhone(phoneID);
    }

}
