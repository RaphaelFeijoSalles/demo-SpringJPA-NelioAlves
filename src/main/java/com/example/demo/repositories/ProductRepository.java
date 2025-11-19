package com.example.demo.repositories;

import com.example.demo.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//interface herda @Repository do JpaRepository
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    //SpringDataJPA já tem uma implementação padrão para essa interface
}
