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
@Table(name = "transaction")
@Proxy(lazy=false)
public class Transaction implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @Column(name = "transaction_id")
    private Integer id;
	
    @Column(name = "productdetail_id")
    private Integer products;
    
    @Column(name = "shop")
    private Integer shop;
	
	@Column(name = "user_id")
    private String user_id;
	
	@Column(name = "user_created")
    private Date user_created;
	
	@Column(name = "state")
    private Boolean state;
	
	
}