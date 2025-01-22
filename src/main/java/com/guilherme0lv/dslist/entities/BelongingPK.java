package com.guilherme0lv.dslist.entities;

import java.util.Objects;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class BelongingPK {

	@ManyToOne
	@JoinColumn(name = "game_id")
	private Game game;
	
	@ManyToOne
	@JoinColumn(name = "lista_id")
	private GameList lista;

	public BelongingPK() {

	}

	public BelongingPK(Game game, GameList lista) {
		this.game = game;
		this.lista = lista;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public GameList getLista() {
		return lista;
	}

	public void setLista(GameList lista) {
		this.lista = lista;
	}

	@Override
	public int hashCode() {
		return Objects.hash(game, lista);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BelongingPK other = (BelongingPK) obj;
		return Objects.equals(game, other.game) && Objects.equals(lista, other.lista);
	}
	
	
	

}
