package com.pichincha.prueba.tienda.domain.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pichincha.prueba.tienda.domain.dao.IProductDAO;

@Service
public class UserBOImpl {

	@Autowired
	private IProductDAO objIProductDAO;

	public Map<String, Object> getUsers() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("users",
				objIProductDAO.findAll());
		return map;
	}
}
