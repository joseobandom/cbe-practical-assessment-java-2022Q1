package com.pichincha.prueba.tienda.application.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pichincha.prueba.tienda.application.constants.Context;
import com.pichincha.prueba.tienda.domain.dao.ICategoryDAO;
import com.pichincha.prueba.tienda.infrastructure.entities.Category;

@RestController
@RequestMapping(Context.context)
public class CategoryController {

	@Autowired
	private ICategoryDAO objICategoryBO;

	@RequestMapping(value = "/categories", method = RequestMethod.GET)
	public List<Category> getCategories(
			@RequestHeader(value = "Accept-Language", required = false) String strLanguage) {

		List<Category> cuenta = new ArrayList<>();
		objICategoryBO.findAll().forEach(cuenta::add);

		return cuenta;

	}
}