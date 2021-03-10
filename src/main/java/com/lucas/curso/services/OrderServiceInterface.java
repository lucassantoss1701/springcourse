package com.lucas.curso.services;

import com.lucas.curso.entities.Order;

import java.util.List;

public interface OrderServiceInterface {
    List<Order> findAll();
    Order findById(Long id);
}
