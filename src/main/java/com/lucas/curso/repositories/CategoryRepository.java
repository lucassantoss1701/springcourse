package com.lucas.curso.repositories;

import com.lucas.curso.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {

}
