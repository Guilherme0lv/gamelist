package com.guilherme0lv.dslist.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.guilherme0lv.dslist.entities.Game;
import com.guilherme0lv.dslist.projections.GameMinProjection;

public interface GameRepository extends JpaRepository<Game, Long>{
	
	@Query(nativeQuery = true, value = """
			SELECT tb_game.id, tb_game.titulo, tb_game.ano, tb_game.img_url AS imgUrl,
			tb_game.descricao_curta, tb_belonging.posicao
			FROM tb_game
			INNER JOIN tb_belonging ON tb_game.id = tb_belonging.game_id
			WHERE tb_belonging.lista_id = :listId
			ORDER BY tb_belonging.posicao
				""")
	List<GameMinProjection> searchByList(Long listId);
	
	
}
