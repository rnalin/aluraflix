package com.renius.AluraFlix.domain;

import java.io.Serializable;

public class VideoDomain implements Serializable {
	private static final long serialVersionUID = 1L;
	Integer id;
	String titulo, descricao, url;
	
	public VideoDomain() {}
	
	public VideoDomain(Integer id, String titulo, String descricao, String url) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
		this.url = url;
	}

	Integer getId() {
		return id;
	}

	void setId(Integer id) {
		this.id = id;
	}

	String getTitulo() {
		return titulo;
	}

	void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	String getDescricao() {
		return descricao;
	}

	void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	String getUrl() {
		return url;
	}

	void setUrl(String url) {
		this.url = url;
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
		VideoDomain other = (VideoDomain) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
