package com.backend.server.product.laptop;

import com.backend.server.product.Product;
import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return Objects.equals(screenHeight, laptop.screenHeight) && Objects.equals(screenWidth, laptop.screenWidth) && storageType == laptop.storageType && Objects.equals(ram, laptop.ram) && Objects.equals(storage, laptop.storage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(screenHeight, screenWidth, storageType, ram, storage);
    }
}
