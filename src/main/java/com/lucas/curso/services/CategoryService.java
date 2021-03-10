package com.lucas.curso.services;

import com.lucas.curso.entities.Category;
import com.lucas.curso.repositories.CategoryRepository;
import com.lucas.curso.services.interfaces.CategoryServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CategoryService implements CategoryServiceInterface {

    @Autowired
    private CategoryRepository repository;

    @Override
    public List<Category> findAll(){
        return repository.findAll();
    }

    @Override
    public Category findById(Long id){
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }

}
