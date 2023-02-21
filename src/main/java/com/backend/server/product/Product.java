package com.backend.server.product;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "product")
@Inheritance(strategy = InheritanceType.JOINED)
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false )
    private Long id;

    @Column( nullable = false, length = 100)
    private String name;

    @Column(name = "serial_number", length = 100)
    private String serialNumber;

    private Short price;

    public Product(String name, String serialNumber, Short price) {
        this.name = name;
        this.serialNumber = serialNumber;
        this.price = price;
    }
}
