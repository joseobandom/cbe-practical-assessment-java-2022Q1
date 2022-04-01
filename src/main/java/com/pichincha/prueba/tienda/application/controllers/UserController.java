package com.pichincha.prueba.tienda.application.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pichincha.prueba.tienda.application.constants.Context;
import com.pichincha.prueba.tienda.domain.dao.IUserDAO;
import com.pichincha.prueba.tienda.infrastructure.entities.User;

@RestController
@RequestMapping(Context.context)
public class UserController {

	@Autowired
	private IUserDAO objIUserDAO;

	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public List<User> getUsers(
			@RequestHeader(value = "Accept-Language", required = false) String strLanguage) {

		List<User> user = new ArrayList<>();
		objIUserDAO.findAll().forEach(user::add);

		return user;

	}
	
	@RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
	public List<User> findByUserId(@PathVariable int id) {

		List<User> user = objIUserDAO.findByuid(id);
		return user;
	}
}