package com.hibicode.size.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import lombok.Data;

@Data
public class Cliente {
	
	private Integer id;
	private String codigo;
	private String nome;
	
	public Cliente(ResultSet rs) {
		try {
			this.id = rs.getInt("id");
			this.codigo = rs.getString("cod_cliente");
			this.nome = rs.getString("nom_cliente");
		} catch (SQLException e) {
			throw new RuntimeException("Error constructing client from ResultSet", e);
		}
	}
	
}
