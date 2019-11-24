package com.wlopera.world.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wlopera.world.model.ChampionshipsDTO;
import com.wlopera.world.service.SoccerWolrdCupAPI;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("${path.api}")
public class SoccerWolrdCupController {

	@Autowired
	SoccerWolrdCupAPI service;

	@GetMapping(path = "${path.cups}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<ChampionshipsDTO> getSoccerWorldCupsJSON() {

		log.info("Controlador - getSoccerWorldCupsJSON");
		return service.getSoccerWorldCups();
	}

	@GetMapping(path = "${path.cups.winner}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<ChampionshipsDTO> getSoccerWorldCupsByWinnersJSON(@PathVariable("winners") Integer winners) {

		log.info("Controlador - getSoccerWorldCupsByWinnersJSON");
		return service.getSoccerWorldCupByWinners(winners);
	}

	@GetMapping(path = "${path.cups.year}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ChampionshipsDTO getSoccerWorldCupsByYearJSON(@PathVariable("year") Integer year) {

		log.info("Controlador - getSoccerWorldCupsByYearJSON");
		return service.getSoccerWorldCupByYear(year);

	}

}
