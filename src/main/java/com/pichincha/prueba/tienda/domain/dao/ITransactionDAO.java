package com.pichincha.prueba.tienda.domain.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pichincha.prueba.tienda.infrastructure.entities.Transaction;

@Repository
public interface ITransactionDAO extends JpaRepository<Transaction, Long>{

	List<Transaction> findByShop(int shop);



}

