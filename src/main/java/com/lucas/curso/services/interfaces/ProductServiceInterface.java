package com.lucas.curso.services.interfaces;

import com.lucas.curso.entities.Product;

import java.util.List;

public interface ProductServiceInterface {
    List<Product> findAll();
    Product findById(Long id);
}
