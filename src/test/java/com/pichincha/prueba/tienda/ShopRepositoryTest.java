package com.pichincha.prueba.tienda;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;

import com.pichincha.prueba.tienda.application.controllers.ShopController;
import com.pichincha.prueba.tienda.domain.dao.IShopDAO;

@WebMvcTest(ShopController.class)
@AutoConfigureMockMvc()
@ActiveProfiles(profiles = "test")
public class ShopRepositoryTest {

	private static final Logger logger = LoggerFactory.getLogger(ShopRepositoryTest.class);

	@Autowired
	private MockMvc mockMvc;
	@MockBean
	private IShopDAO iShopDAO;
	@Test
	public void getShops() throws Exception {
		mockMvc.perform(get("/prueba/shops")).andExpect(status().is(HttpStatus.OK.value())).andReturn()
				.getResponse().getContentAsString();
	}
}
