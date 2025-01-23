package com.guilherme0lv.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.guilherme0lv.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

	@Modifying
	@Query(nativeQuery = true, value = "UPDATE tb_belonging SET posicao = :newPosicao WHERE lista_id = :listaId AND game_id = :gameId")
	void updateBelongingPosition(Long listaId, Long gameId, Integer newPosicao);
}