package com.pichincha.prueba.tienda;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.pichincha.prueba.tienda.application.controllers.CategoryController;
import com.pichincha.prueba.tienda.application.controllers.ProductController;
import com.pichincha.prueba.tienda.application.controllers.ShopController;
import com.pichincha.prueba.tienda.application.controllers.UserController;

@RunWith(SpringRunner.class)
@SpringBootTest
class TiendaApplicationTests {

		@Autowired
		private CategoryController ccontroller;
		
		@Autowired
		private ProductController pcontroller;
		
		@Autowired
		private ShopController scontroller;
		
		@Autowired
		private UserController ucontroller;

		@Test
		void contextLoadCategory() {
			assertThat(ccontroller).isNotNull();
		}
		
		@Test
		void contextLoadProduct() {
			assertThat(pcontroller).isNotNull();
		}
		
		@Test
		void contextLoadShop() {
			assertThat(scontroller).isNotNull();
		}
		
		@Test
		void contextLoadUser() {
			assertThat(ucontroller).isNotNull();
		}

}
