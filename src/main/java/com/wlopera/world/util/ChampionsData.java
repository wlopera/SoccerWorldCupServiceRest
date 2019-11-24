package com.wlopera.world.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.extern.slf4j.Slf4j;

/**
 * Datos de los campeonatos mundiales de futbol
 *  
 * @author wlopera
 */
@Slf4j
public class ChampionsData {

	private static ChampionsData instance; // Patrin sigleton
	
	private Map<Integer, String> headquarters;
	private Map<Integer, String> years; 
	private Map<Integer, String> champions;
	private Map<Integer, String> scores; 
	private Map<Integer, String> subChampions;

	public ChampionsData() {
		initData();
	}
	
	// retorna la instancia singleton creada
	public static ChampionsData getInstance() {
		if (null == instance) {
			instance = new ChampionsData();
		}
		return instance;
	}
	
	//============================
	// Metodos publicos 
	//=============================

	/**
	 * Main solo para prueba de la data 
	 * 
	 * @param arg
	 */
	public static void main(String[] arg) {
		ChampionsData data = new ChampionsData();
		data.initData();
		data.headquarters.forEach((x,y) -> log.info(y));
		data.years.forEach((x,y) -> log.info(y));
		data.champions.forEach((x,y) -> log.info(y));
		data.scores.forEach((x,y) -> log.info(y));
		data.subChampions.forEach((x,y) -> log.info(y));
	}

	//============================
	// Metodos privados 
	//=============================
	
	public Map<Integer, String> getHeadquarters() {
		return headquarters;
	}

	public Map<Integer, String> getYears() {
		return years;
	}

	public Map<Integer, String> getChampions() {
		return champions;
	}

	public Map<Integer, String> getScores() {
		return scores;
	}

	public Map<Integer, String> getSubChampions() {
		return subChampions;
	}

	/**
	 * Inicializador de mapa de datos originales
	 * 
	 */
	private void initData() {
		headquarters = getMapByPosition(getData(), 0);
		years = getMapByPosition(getData(), 1);
		champions = getMapByPosition(getData(), 2);
		scores = getMapByPosition(getData(), 3);
		subChampions = getMapByPosition(getData(), 4);
	}
	
	/**
	 * Mapa de datos segun la posicion de los datos en la lista de resultados originales de los campeonatos.
	 * 
	 * @param data
	 * @param position
	 * 
	 * @return Lista de resultados de los campeonatos 
	 */
	private Map<Integer, String> getMapByPosition(List<String[]> data, int position) {

		Map<Integer, String> map = new HashMap<>();
		int i = 1;

		for (String[] item : data) {
			map.put(i++, item[position]);
		}
		return map;
	}

	/**
	 * Data original de los campeones por sede, annio, campeon, resultado , campeon y sub-campeon.
	 * 
	 * @return Lista de datos originales
	 */
	private List<String[]> getData() {

		List<String[]> data = new ArrayList<>();

		data.add(new String[] { ConstantsEnum.COUNTRY_URUGUAY.getValue(), "1930", ConstantsEnum.COUNTRY_URUGUAY.getValue(), "4-2", ConstantsEnum.COUNTRY_ARGENTINA.getValue() });
		data.add(new String[] { ConstantsEnum.COUNTRY_ITALIA.getValue(), "1934", ConstantsEnum.COUNTRY_ITALIA.getValue(), "2-1",ConstantsEnum.COUNTRY_CHECOSOLOVAQUIA.getValue()});
		data.add(new String[] { ConstantsEnum.COUNTRY_FRANCIA.getValue(), "1938", ConstantsEnum.COUNTRY_ITALIA.getValue() , "4-2", ConstantsEnum.COUNTRY_HUNGRIA.getValue() });
		data.add(new String[] { ConstantsEnum.COUNTRY_BRASIL.getValue(), "1950", ConstantsEnum.COUNTRY_URUGUAY.getValue(), "2-1", ConstantsEnum.COUNTRY_BRASIL.getValue() });
		data.add(new String[] { ConstantsEnum.COUNTRY_SUIZA.getValue(), "1954", ConstantsEnum.COUNTRY_ALEMANIA.getValue(), "3-2", ConstantsEnum.COUNTRY_HUNGRIA.getValue() });
		data.add(new String[] { ConstantsEnum.COUNTRY_SUECIA.getValue(), "1958", ConstantsEnum.COUNTRY_BRASIL.getValue(), "5-2", ConstantsEnum.COUNTRY_SUECIA.getValue() });
		data.add(new String[] { ConstantsEnum.COUNTRY_CHILE.getValue(), "1962", ConstantsEnum.COUNTRY_BRASIL.getValue(), "3-1", ConstantsEnum.COUNTRY_CHECOSOLOVAQUIA.getValue() });
		data.add(new String[] { ConstantsEnum.COUNTRY_INGLATERRA.getValue(), "1966", ConstantsEnum.COUNTRY_INGLATERRA.getValue(), "4-2", ConstantsEnum.COUNTRY_ALEMANIA.getValue() });
		data.add(new String[] { ConstantsEnum.COUNTRY_MEXICO.getValue(), "1970", ConstantsEnum.COUNTRY_BRASIL.getValue(), "4-1", ConstantsEnum.COUNTRY_ITALIA.getValue() });
		data.add(new String[] { ConstantsEnum.COUNTRY_ALEMANIA.getValue(), "1974", ConstantsEnum.COUNTRY_ALEMANIA.getValue(), "2-1", ConstantsEnum.COUNTRY_HOLANDA.getValue() });
		data.add(new String[] { ConstantsEnum.COUNTRY_ARGENTINA.getValue(), "1978", ConstantsEnum.COUNTRY_ARGENTINA.getValue(), "3-1", ConstantsEnum.COUNTRY_HOLANDA.getValue() });
		data.add(new String[] { ConstantsEnum.COUNTRY_ESPANNIA.getValue(), "1982", ConstantsEnum.COUNTRY_ITALIA.getValue(), "3-1", ConstantsEnum.COUNTRY_ALEMANIA.getValue() });
		data.add(new String[] { ConstantsEnum.COUNTRY_MEXICO.getValue(), "1986", ConstantsEnum.COUNTRY_ARGENTINA.getValue(), "3-2", ConstantsEnum.COUNTRY_ALEMANIA.getValue() });
		data.add(new String[] { ConstantsEnum.COUNTRY_ITALIA.getValue(), "1990", ConstantsEnum.COUNTRY_ALEMANIA.getValue(), "1-0", ConstantsEnum.COUNTRY_ARGENTINA.getValue() });
		data.add(new String[] { ConstantsEnum.COUNTRY_USA.getValue(), "1994", ConstantsEnum.COUNTRY_BRASIL.getValue(), "3-2", ConstantsEnum.COUNTRY_ITALIA.getValue() });
		data.add(new String[] { ConstantsEnum.COUNTRY_FRANCIA.getValue(), "1998", ConstantsEnum.COUNTRY_FRANCIA.getValue(), "3-0", ConstantsEnum.COUNTRY_BRASIL.getValue() });
		data.add(new String[] { ConstantsEnum.COUNTRY_COREA_JAPON.getValue(), "2002", ConstantsEnum.COUNTRY_BRASIL.getValue(), "2-0", ConstantsEnum.COUNTRY_ALEMANIA.getValue() });
		data.add(new String[] { ConstantsEnum.COUNTRY_ALEMANIA.getValue(), "2006", ConstantsEnum.COUNTRY_ITALIA.getValue(), "5-3", ConstantsEnum.COUNTRY_ALEMANIA.getValue() });
		data.add(new String[] { ConstantsEnum.COUNTRY_SUDAFRICA.getValue(), "2010", ConstantsEnum.COUNTRY_ESPANNIA.getValue(), "1-0", ConstantsEnum.COUNTRY_HOLANDA.getValue() });
		data.add(new String[] { ConstantsEnum.COUNTRY_BRASIL.getValue(), "2014", ConstantsEnum.COUNTRY_ALEMANIA.getValue(), "1-0", ConstantsEnum.COUNTRY_ARGENTINA.getValue() });
		data.add(new String[] { ConstantsEnum.COUNTRY_RUSIA.getValue(), "2018", ConstantsEnum.COUNTRY_FRANCIA.getValue(), "4-2", "Croacia" });

		return data;
	}
}
