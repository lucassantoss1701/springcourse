package com.lucas.curso.services;

import com.lucas.curso.entities.Product;
import com.lucas.curso.repositories.ProductRepository;
import com.lucas.curso.services.interfaces.ProductServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ProductService implements ProductServiceInterface {

    @Autowired
    private ProductRepository repository;

    @Override
    public List<Product> findAll(){
        return repository.findAll();
    }

    @Override
    public Product findById(Long id){
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }

}
