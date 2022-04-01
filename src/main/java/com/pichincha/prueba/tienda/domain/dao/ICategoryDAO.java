package com.pichincha.prueba.tienda.domain.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pichincha.prueba.tienda.infrastructure.entities.Category;

@Repository
public interface ICategoryDAO extends JpaRepository<Category, String>{



}

