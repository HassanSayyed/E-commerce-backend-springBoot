package com.backend.server.Models;

import com.backend.server.product.phone.Phone;
import com.backend.server.product.phone.PhoneRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


@SpringBootTest
public class PhoneRepositoryTest {


    private final PhoneRepository phoneRepository;

    @Autowired
    public PhoneRepositoryTest(PhoneRepository phoneRepository) {
        this.phoneRepository = phoneRepository;
    }

    @Test
    public void testCreatePhone() {
        Phone phone = new Phone("Samsung Galaxy S21", "12345", (short) 800,
                (short) 1080, (short) 2400, (short) 8, (short) 128);
        phoneRepository.save(phone);
        assertNotNull(phone.getId());
    }

    @Test
    public void testFindByName() {
        Phone phone = new Phone("iPhone 12 Pro Max", "67890", (short) 1000,
                (short) 1284, (short) 2778, (short) 6, (short) 512);
        phoneRepository.save(phone);
        Optional<Phone> foundPhone = phoneRepository.findByName("iPhone 12 Pro Max");
        assertNotNull(foundPhone);
        assertEquals("67890", foundPhone.get().getSerialNumber());
    }

    @Test
    public void testFindBySerialNumber() {
        Phone phone = new Phone("iPhone 12 Pro Max", "1200", (short) 1000,
                (short) 1284, (short) 2778, (short) 6, (short) 512);
        phoneRepository.save(phone);
        Optional<Phone> foundPhone = phoneRepository.findBySerialNumber("1200");
        assertNotNull(foundPhone);
        assertEquals("iPhone 12 Pro Max", foundPhone.get().getName());
    }

}
