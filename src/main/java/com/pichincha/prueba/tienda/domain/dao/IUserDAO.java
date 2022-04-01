package com.pichincha.prueba.tienda.domain.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pichincha.prueba.tienda.infrastructure.entities.User;

@Repository
public interface IUserDAO extends JpaRepository<User, Long>{

	List<User> findByuid(int id);



}

