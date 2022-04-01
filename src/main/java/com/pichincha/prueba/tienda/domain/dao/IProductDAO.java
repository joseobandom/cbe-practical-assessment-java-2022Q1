package com.pichincha.prueba.tienda.domain.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pichincha.prueba.tienda.infrastructure.entities.Product;

@Repository
public interface IProductDAO extends JpaRepository<Product, String>{



}

