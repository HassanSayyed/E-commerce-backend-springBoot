package com.backend.server.Models;

import com.backend.server.product.Product;
import com.backend.server.product.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class ProductRepositoryTest {

    private final ProductRepository productRepository;

    @Autowired
    public ProductRepositoryTest(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Test
    public void getAllProductsTest(){
        Product product = new Product(
                "product 1",
                "65146846",
                (short) 55
        );
        Product product2 = new Product(
                "product 2",
                "65146855",
                (short) 59
        );


        productRepository.save(product);
        productRepository.save(product2);

        List<Product> productList = productRepository.findAll();

        System.out.println(productList.toString());
        // 2 created + 5 in config ( Phones , Laptops)
        assertEquals(productList.size(),7);
    }

}
