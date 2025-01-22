package com.guilherme0lv.dslist.dto;

import org.springframework.beans.BeanUtils;

import com.guilherme0lv.dslist.entities.Game;

public class GameDTO {
	
	private Long id;
	private String titulo;
	private Integer ano;
	private String genero;
	private String plataforma;
	private Double score;
	private String imgUrl;
	private String descricaoCurta;
	private String descricao;
	
	public GameDTO() {
		
	}
	
	public GameDTO(Game entity) {
		BeanUtils.copyProperties(entity, this);
		/*
			this.id = entity.getId();
			this.titulo = entity.getTitulo();
			this.ano = entity.getAno();
			this.genero = entity.getGenero();
			this.plataforma = entity.getPlataforma();
			this.score = entity.getScore();
			this.imgUrl = entity.getImgURL();
			this.descricaoCurta = entity.getDescricaoCurta();
			this.descricao = entity.getDescricao();
		*/
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getDescricaoCurta() {
		return descricaoCurta;
	}

	public void setDescricaoCurta(String descricaoCurta) {
		this.descricaoCurta = descricaoCurta;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	

}
