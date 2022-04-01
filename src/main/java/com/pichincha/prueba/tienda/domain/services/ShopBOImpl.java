package com.pichincha.prueba.tienda.domain.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pichincha.prueba.tienda.domain.dao.IShopDAO;

@Service
public class ShopBOImpl {

	@Autowired
	private IShopDAO objIShopDAO;

	public Map<String, Object> getShops() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("shops",
				objIShopDAO.findAll());
		return map;
	}
}
