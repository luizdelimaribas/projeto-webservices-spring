package com.exercicioCursoJava.Projeto.web.services.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exercicioCursoJava.Projeto.web.services.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
