package com.example.demo.repositories;

import com.example.demo.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//interface herda @Repository do JpaRepository
@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    //SpringDataJPA já tem uma implementação padrão para essa interface
}
