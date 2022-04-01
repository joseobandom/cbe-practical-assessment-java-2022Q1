package com.pichincha.prueba.tienda.infrastructure.entities;

import java.io.Serializable;

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
@Table(name = "category")
@Proxy(lazy=false)
public class Category implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @Column(name = "category_id")
    private Integer id;
	
	@Column(name = "description")
    private String description;
	
	@Column(name = "state")
    private Boolean state;
	
	
}
