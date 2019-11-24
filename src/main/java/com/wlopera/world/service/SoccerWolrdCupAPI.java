package com.wlopera.world.service;

import java.util.List;

import com.wlopera.world.model.ChampionshipsDTO;

/**
 * Interface de Consulta de campeonatos mundiales de futbol.
 * 
 * @author Willian Lopera
 */
public interface SoccerWolrdCupAPI {
	/**
	 * Consultar la lista de paises ganadores de una cantidad especifica de mundiales de futbol.
	 * 
	 * @param winners Cantidad de campeonatos ganados
	 * 
	 * @return Listado de campeones que solo han ganado esa cantidad exacta de campeonatos.
	 */
	List<ChampionshipsDTO> getSoccerWorldCupByWinners(Integer winners);

	/**
	 * Consulta todos los campeonatos de la copa mundial de futbol.
	 * 
	 * @return Listado de todos los campeones de los campeonatos de la copa mundial
	 */
	List<ChampionshipsDTO> getSoccerWorldCups();

	/**
	 * Consultar el pais ganador del mundial de un annio solicitado.
	 * 
	 * @param year Annio del mundial
	 * 
	 * @return Pais que gano el campeonato ese annio
	 */
	ChampionshipsDTO getSoccerWorldCupByYear(Integer year);

}
