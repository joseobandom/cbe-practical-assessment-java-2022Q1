package com.pichincha.prueba.tienda.infrastructure.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "product_detail")
@Proxy(lazy=false)
public class ProductDetail implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @Column(name = "productdetail_id")
    private Integer id;
	
	@Column(name = "user_id")
    private Integer username;
	
	@Column(name = "product_id")
    private Integer products;
	
	@Column(name = "purchase_date")
    private Date purchase_date;
	
	@Column(name = "state")
    private Boolean state;
	
	
}
