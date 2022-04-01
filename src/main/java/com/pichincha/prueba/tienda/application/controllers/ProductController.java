package com.pichincha.prueba.tienda.application.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pichincha.prueba.tienda.application.constants.Context;
import com.pichincha.prueba.tienda.domain.dao.IProductDAO;
import com.pichincha.prueba.tienda.infrastructure.entities.Product;

@RestController
@RequestMapping(Context.context)
public class ProductController {

	@Autowired
	private IProductDAO objIProductDAO;

	@RequestMapping(value = "/products", method = RequestMethod.GET)
	public List<Product> getCategories(
			@RequestHeader(value = "Accept-Language", required = false) String strLanguage) {

		List<Product> product = new ArrayList<>();
		objIProductDAO.findAll().forEach(product::add);

		return product;

	}
}