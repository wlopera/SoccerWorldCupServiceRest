package com.wlopera.world.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import com.wlopera.world.model.ChampionshipsDTO;
import com.wlopera.world.service.SoccerWolrdCupDummyService;

/**
 * Pruebas unitarias API SoccerWorldCupAPI
 * 
 * @author Willian Lopera
 */
@RunWith(MockitoJUnitRunner.class)
public class SoccerWoldCupDummyServiceTest {

	@InjectMocks
	private SoccerWolrdCupDummyService service;

	@Test
	public void testGetSoccerWorldCups() {

		List<ChampionshipsDTO> cups = service.getSoccerWorldCups();
		
		//when(cups.size()).thenReturn(21);
    //assertEquals(0.0, calculatorService.calculateAverage(), .01);
    
		assertNotNull(cups);
		assertFalse(cups.size() > 30);
		
		assertEquals("21", ""+cups.size());
		
	}
	
	@Test
	public void testGetSoccerWorldCupByYear() {
		
		assertEquals(2018, service.getSoccerWorldCupByYear(2018).getYear());
		assertNotEquals(2018, service.getSoccerWorldCupByYear(20184633).getYear());
		
	}

}
