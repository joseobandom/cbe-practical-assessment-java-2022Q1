package com.pichincha.prueba.tienda.application.controllers;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pichincha.prueba.tienda.domain.dao.IShopDAO;
import com.pichincha.prueba.tienda.infrastructure.entities.Shop;

@RestController
@RequestMapping("/prueba")
public class ShopController {
	public static final Logger logger = LoggerFactory.getLogger(ShopController.class);
	@Autowired
	private IShopDAO objIShopDAO;

	@RequestMapping(value = "/shops", method = RequestMethod.GET)
	public List<Shop> getShops(@RequestHeader(value = "Accept-Language", required = false) String strLanguage) {

		List<Shop> shop = new ArrayList<>();
		objIShopDAO.findAll().forEach(shop::add);

		return shop;

	}

	@PostMapping(value = "/shop")
	public Shop post(@RequestBody Shop Shop) {
		Shop shop = objIShopDAO.save(Shop);

		return shop;
	}

	@PutMapping(value = "/shop")
	public Shop put(@RequestBody Shop Shop) {
		Shop shop = objIShopDAO.save(Shop);

		return shop;
	}

	@DeleteMapping(value = "/shop/{id}")
	public ResponseEntity deleteById(@PathVariable String id) {
		logger.info("Delete shop with id {}", id);
		objIShopDAO.deleteById(id);
		return new ResponseEntity(true, HttpStatus.OK);
	}

}