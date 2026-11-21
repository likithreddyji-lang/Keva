package com.keva.ProductApp.Repository;

import com.keva.ProductApp.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KevaRepository extends JpaRepository<Product,Integer> {
}
