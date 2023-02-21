package com.backend.server.product.laptop;

import com.backend.server.product.phone.Phone;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LaptopRepository extends JpaRepository<Laptop, Long> {

    Optional<Phone> findByName(String name);
    Optional<Phone> findBySerialNumber(String serialNumber);
}
