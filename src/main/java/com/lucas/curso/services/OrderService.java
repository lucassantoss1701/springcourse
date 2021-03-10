package com.lucas.curso.services;

import com.lucas.curso.entities.Order;
import com.lucas.curso.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class OrderService implements OrderServiceInterface {

    @Autowired
    private OrderRepository repository;

    @Override
    public List<Order> findAll(){
        return repository.findAll();
    }

    @Override
    public Order findById(Long id){
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }

}
