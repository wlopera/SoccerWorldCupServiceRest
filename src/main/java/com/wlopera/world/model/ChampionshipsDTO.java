package com.wlopera.world.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Clase CampeonatoDTO - Modelo de Negocio 
 * 
 * @author wlopera
 *
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ChampionshipsDTO implements Serializable {

	private static final long serialVersionUID = 4549486316542702890L;
	
	private String headquarter;
	private int year;
	private String champion;
	private String score;
	private String subChampion;

}
