package com.backend.server.product.phone;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class PhoneConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            PhoneRepository repository){
        return args->{
            Phone iPhone14 =
                    new Phone(
                            "Iphone",
                            "684d684cs054",
                            (short) 4,
                            (short) 5,
                            (short) 8,
                            (short) 180
                    );
            Phone samsungS20 =
                    new Phone(
                            "samsungS20",
                            "684d684cs054",
                            (short) 4,
                            (short) 5,
                            (short) 8,
                            (short) 128
                    );
            repository.saveAll(
                    List.of(
                            iPhone14,samsungS20
                    )
            );
        };

    }
}
