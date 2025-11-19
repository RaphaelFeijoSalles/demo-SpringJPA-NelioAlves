package com.example.demo.repositories;

import com.example.demo.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//interface herda @Repository do JpaRepository
@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
    //SpringDataJPA já tem uma implementação padrão para essa interface
}
