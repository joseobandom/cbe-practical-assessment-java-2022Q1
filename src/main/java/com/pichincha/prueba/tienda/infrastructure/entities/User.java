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
@Table(name = "person")
@Proxy(lazy=false)
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @Column(name = "uid")
    private Integer uid;
	
    @Column(name = "cedula")
    private Integer cedula;
	
	@Column(name = "username")
    private String username;
	
	@Column(name = "user_created")
    private Date user_created;
	
	@Column(name = "state")
    private Boolean state;
	
	
}
