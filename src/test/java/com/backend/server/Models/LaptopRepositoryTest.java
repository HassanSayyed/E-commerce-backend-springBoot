package com.backend.server.Models;

import com.backend.server.product.laptop.Laptop;
import com.backend.server.product.laptop.LaptopRepository;
import com.backend.server.product.laptop.StorageType;
import com.backend.server.product.phone.Phone;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class LaptopRepositoryTest {

    private final LaptopRepository laptopRepository;
    @Autowired
    public LaptopRepositoryTest(LaptopRepository laptopRepository) {
        this.laptopRepository = laptopRepository;
    }

    @Test
    public void testCreateLaptop() {
        Laptop laptop = new Laptop(
                "lenovo",
                "656546894",
                (short) 500,
                (short) 10,
                (short) 15,
                StorageType.SSD,
                (short) 16,
                (short) 100

        );
        laptopRepository.save(laptop);
        assertNotNull(laptop.getId());
    }

    @Test
    public void testFindBySerialNumber() {
        Laptop laptop = new Laptop(
                "lenovo",
                "656546894",
                (short) 500,
                (short) 10,
                (short) 15,
                StorageType.SSD,
                (short) 16,
                (short) 100

        );
        laptopRepository.save(laptop);
        Optional<Phone> foundPhone = laptopRepository.findBySerialNumber("67890");
        assertNotNull(foundPhone);
        assertEquals("lenovo", foundPhone.get().getName());
    }
}
