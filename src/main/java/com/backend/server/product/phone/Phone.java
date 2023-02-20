package com.backend.server.product.phone;

import com.backend.server.product.Product;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.util.Objects;

@Entity
@Table(name = "phone")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Phone extends Product {


    private Short screenHeight;
    private Short screenWidth;
    private Short ram;
    private Short storage;

    public Phone( String name, String serialNumber, Short screenHeight, Short screenWidth, Short ram, Short storage) {
        super( name, serialNumber);
        this.screenHeight = screenHeight;
        this.screenWidth = screenWidth;
        this.ram = ram;
        this.storage = storage;
    }

    public Phone(Long id, String name, String serialNumber, Short ram, Short storage) {
        super(id, name, serialNumber);
        this.ram = ram;
        this.storage = storage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return Objects.equals(screenHeight, phone.screenHeight) && Objects.equals(screenWidth, phone.screenWidth) && Objects.equals(ram, phone.ram) && Objects.equals(storage, phone.storage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(screenHeight, screenWidth, ram, storage);
    }
}
