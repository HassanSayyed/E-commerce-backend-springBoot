package com.backend.server.product;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "product")
@Inheritance(strategy = InheritanceType.JOINED)
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
