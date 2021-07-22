package com.renius.AluraFlix.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Video implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	String titulo;
	String descricao;
	String url;
	
	public Video() {}
	
	public Video(Integer id, String titulo, String descricao, String url) {
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
	
	
	
	
}
