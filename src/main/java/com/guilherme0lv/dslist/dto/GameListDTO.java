package com.guilherme0lv.dslist.dto;

import com.guilherme0lv.dslist.entities.GameList;

public class GameListDTO {
	
	private Long id;
	private String nome;

	public GameListDTO() {
		
	}

	public GameListDTO(GameList entity) {
		this.id = entity.getId();
		this.nome = entity.getNome();
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}
	
}
