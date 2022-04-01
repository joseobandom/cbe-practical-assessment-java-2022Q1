package com.pichincha.prueba.tienda.domain.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pichincha.prueba.tienda.infrastructure.entities.Shop;

@Repository
public interface IShopDAO extends JpaRepository<Shop, String>{



}

