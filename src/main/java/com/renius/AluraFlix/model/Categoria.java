package com.renius.AluraFlix.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

public class Categoria implements Serializable{
	private static final long serialVersionUID = 1L;
	@Getter 
	@Setter
	private Integer id;
	@Getter 
	@Setter
	private String titulo;
	@Getter 
	@Setter
	private String cor;
	
	public Categoria() {}
	
	public Categoria(Integer id, String titulo, String cor) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.cor = cor;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
}
