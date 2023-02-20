package com.backend.server.product.phone;

import com.backend.server.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneRepository extends JpaRepository<Phone, Long> {

}
