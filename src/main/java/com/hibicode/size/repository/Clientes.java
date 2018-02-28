package com.hibicode.size.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hibicode.size.model.Cliente;

@Repository
public class Clientes {

	@Autowired
	private JdbcTemplate db;
	
	public List<Cliente> findAll() {
		return db.query("select * from cliente", (rs, rowNum) -> new Cliente(rs));
	}
	
}
