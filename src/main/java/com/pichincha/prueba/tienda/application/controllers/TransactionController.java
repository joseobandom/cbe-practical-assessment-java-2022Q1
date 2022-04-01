package com.pichincha.prueba.tienda.application.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pichincha.prueba.tienda.application.constants.Context;
import com.pichincha.prueba.tienda.domain.dao.ITransactionDAO;
import com.pichincha.prueba.tienda.infrastructure.entities.Shop;
import com.pichincha.prueba.tienda.infrastructure.entities.Transaction;
import com.pichincha.prueba.tienda.infrastructure.entities.User;

@RestController
@RequestMapping(Context.context)
public class TransactionController {

	@Autowired
	private ITransactionDAO objITransactionDAO;

	@PostMapping(value = "/transaction")
	public Transaction post(@RequestBody Transaction Transaction) {
		Transaction transaction = objITransactionDAO.save(Transaction);

		return transaction;
	}

	@RequestMapping(value = "/transactions", method = RequestMethod.GET)
	public List<Transaction> getTransactions(
			@RequestHeader(value = "Accept-Language", required = false) String strLanguage) {

		List<Transaction> transaction = new ArrayList<>();
		objITransactionDAO.findAll().forEach(transaction::add);

		return transaction;

	}

	@RequestMapping(value = "/transaction/{id}", method = RequestMethod.GET)
	public List<Transaction> findByShop(@PathVariable int id) {

		List<Transaction> transaction = objITransactionDAO.findByShop(id);
		return transaction;
	}
}