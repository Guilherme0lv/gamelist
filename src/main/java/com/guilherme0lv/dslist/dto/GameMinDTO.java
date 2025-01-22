package com.guilherme0lv.dslist.dto;

import com.guilherme0lv.dslist.entities.Game;
import com.guilherme0lv.dslist.projections.GameMinProjection;

public class GameMinDTO {
	
	private Long id;
	private String titulo;
	private Integer ano;
	private String imgUrl;
	private String descricaoCurta;
	
	public GameMinDTO() {
		
	}

	public GameMinDTO(Game entity) {
		this.id = entity.getId();
		this.titulo = entity.getTitulo();
		this.ano = entity.getAno();
		this.imgUrl = entity.getImgUrl();
		this.descricaoCurta = entity.getDescricaoCurta();
	}
	
	public GameMinDTO(GameMinProjection projection) {
		this.id = projection.getId();
		this.titulo = projection.getTitulo();
		this.ano = projection.getAno();
		this.imgUrl = projection.getImgUrl(); 
		this.descricaoCurta = projection.getDescricaoCurta();
	}

	public Long getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public Integer getAno() {
		return ano;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getDescricaoCurta() {
		return descricaoCurta;
	}
	
}
