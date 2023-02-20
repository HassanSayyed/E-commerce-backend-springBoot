package com.backend.server.product.laptops;

import com.backend.server.product.Product;
import com.backend.server.user.Role;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "laptop")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Laptop extends Product {

    @Column(name = "screen_height")
    private Short screenHeight;

    @Column(name = "screen_width")
    private Short screenWidth;

    @Enumerated(EnumType.STRING)
    private StorageType storageType;

    private Short ram;
    private Short storage;

    public Laptop(String name, String serialNumber, Short price,
                  Short screenHeight, Short screenWidth,
                  StorageType storageType, Short ram, Short storage) {
        super(name, serialNumber, price);
        this.screenHeight = screenHeight;
        this.screenWidth = screenWidth;
        this.storageType = storageType;
        this.ram = ram;
        this.storage = storage;
    }
}
