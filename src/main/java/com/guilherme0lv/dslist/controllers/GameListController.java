package com.guilherme0lv.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guilherme0lv.dslist.dto.GameListDTO;
import com.guilherme0lv.dslist.services.GameListService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
	
	@Autowired
	private GameListService gameListService;

	@GetMapping
	public List<GameListDTO> findall() {
		List<GameListDTO> result = gameListService.findAll();
		
		return result;
	}

	
	
}
