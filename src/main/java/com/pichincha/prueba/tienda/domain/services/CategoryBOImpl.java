package com.pichincha.prueba.tienda.domain.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pichincha.prueba.tienda.domain.dao.ICategoryDAO;

@Service
public class CategoryBOImpl {

	@Autowired
	private ICategoryDAO objICategoryDAO;

	public Map<String, Object> getCategories() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("categories",
				objICategoryDAO.findAll());
		return map;
	}
}
