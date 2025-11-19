package com.example.demo.repositories;

import com.example.demo.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//interface herda @Repository do JpaRepository
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    //SpringDataJPA já tem uma implementação padrão para essa interface
}
