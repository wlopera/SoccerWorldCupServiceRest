package com.wlopera.world.util;

/**
 * Utilitario con los nombres de los COUNTRYes
 * @author Willian Lopera
 *
 */
public enum ConstantsEnum {
	
	COUNTRY_ARGENTINA("Argentina"),
	COUNTRY_URUGUAY("Uruguay"),
	COUNTRY_CHECOSOLOVAQUIA("Checoslovaquia"),
	COUNTRY_ITALIA("Italia"),
	COUNTRY_FRANCIA("Francia"),
	COUNTRY_BRASIL("Brasil"),
	COUNTRY_ALEMANIA("Alemania"),
	COUNTRY_SUIZA("Suiza"),
	COUNTRY_HUNGRIA("Hungría"),
	COUNTRY_SUECIA("Suecia"),
	COUNTRY_CHILE("Chile"),
	COUNTRY_INGLATERRA("Inglaterra"),
	COUNTRY_MEXICO("México"),
	COUNTRY_HOLANDA("Holanda"),
	COUNTRY_ESPANNIA("España"),
	COUNTRY_USA("Estados Unidos"),
	COUNTRY_COREA_JAPON("Corea/Japon"),
	COUNTRY_SUDAFRICA("Sudáfrica"),
	COUNTRY_RUSIA("Rusia"),
	COUNTRY_CROACIA("Croacia");
	
	private String value;
	
	private ConstantsEnum(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
}
