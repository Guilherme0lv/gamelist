package com.guilherme0lv.dslist.repositories;

import com.guilherme0lv.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}