package com.lucas.curso.services.interfaces;

import com.lucas.curso.entities.Category;

import java.util.List;

public interface CategoryServiceInterface {
    List<Category> findAll();
    Category findById(Long id);
}
