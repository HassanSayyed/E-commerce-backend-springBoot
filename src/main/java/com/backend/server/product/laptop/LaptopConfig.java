package com.backend.server.product.laptop;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class LaptopConfig {

    @Bean
    CommandLineRunner addMockDataLaptops(
            LaptopRepository repository){
        return args->{
                Laptop lenovo = new Laptop(
                        "lenovo",
                        "656546894",
                        (short) 500,
                        (short) 10,
                        (short) 15,
                        StorageType.SSD,
                        (short) 16,
                        (short) 100

                );
            Laptop msi = new Laptop(
                    "msi",
                    "656546800",
                    (short) 500,
                    (short) 11,
                    (short) 16,
                    StorageType.HDD,
                    (short) 8,
                    (short) 60

            );

            repository.saveAll(
                    List.of(
                         lenovo,msi
                    )
            );
        };

    }
}
