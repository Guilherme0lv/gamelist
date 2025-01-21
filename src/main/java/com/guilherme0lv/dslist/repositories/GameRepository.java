package com.guilherme0lv.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guilherme0lv.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
	
}
