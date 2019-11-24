package com.wlopera.world.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.wlopera.world.model.ChampionshipsDTO;
import com.wlopera.world.util.ChampionsData;

@Service
public class SoccerWolrdCupDummyService implements SoccerWolrdCupAPI {

	@Override
	public List<ChampionshipsDTO> getSoccerWorldCupByWinners(Integer winners) {

		ChampionsData championData = ChampionsData.getInstance();
		List<ChampionshipsDTO> champions = new ArrayList<>();
		Map<String, List<ChampionshipsDTO>> map = new HashMap<>();
		ChampionshipsDTO champion = null;

		for (int i = 1; i < championData.getHeadquarters().size() + 1; i++) {

			champion = new ChampionshipsDTO(championData.getHeadquarters().get(i),
					Integer.parseInt(championData.getYears().get(i)), championData.getChampions().get(i),
					championData.getScores().get(i), championData.getSubChampions().get(i));

			if (map.containsKey(champion.getChampion())) {
				map.get(champion.getChampion()).add(champion);
				continue;
			}

			List<ChampionshipsDTO> championsAux = new ArrayList<>();
			championsAux.add(champion);
			map.put(champion.getChampion(), championsAux);

		}

		map.forEach((k, v) -> {
			if (winners == v.size()) {
				champions.addAll(v);
			}
		});

		return champions;
		
	}

	@Override
	public List<ChampionshipsDTO> getSoccerWorldCups() {

		ChampionsData championData = ChampionsData.getInstance();
		List<ChampionshipsDTO> champions = new ArrayList<>();

		for (int i = 1; i < championData.getHeadquarters().size() + 1; i++) {
			
			champions.add(new ChampionshipsDTO(championData.getHeadquarters().get(i),
					Integer.parseInt(championData.getYears().get(i)), championData.getChampions().get(i),
					championData.getScores().get(i), championData.getSubChampions().get(i)));
			
		}

		return champions;

	}

	@Override
	public ChampionshipsDTO getSoccerWorldCupByYear(Integer year) {

		ChampionsData championData = ChampionsData.getInstance();

		for (Integer key : championData.getYears().keySet()) {
			
			if (championData.getYears().get(key).equals(String.valueOf(year))) {
			
				return new ChampionshipsDTO(championData.getHeadquarters().get(key),
						Integer.parseInt(championData.getYears().get(key)), championData.getChampions().get(key),
						championData.getScores().get(key), championData.getSubChampions().get(key));
			}
			
		}

		return new ChampionshipsDTO();

	}

}
