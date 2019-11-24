package com.wlopera.world.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.wlopera.world.model.ChampionshipsDTO;
import com.wlopera.world.service.SoccerWolrdCupAPI;
import com.wlopera.world.service.SoccerWolrdCupDummyService;

/**
 * Pruebas unitarias controlador SoccerWorldCupRestService
 * 
 * @author Willian Lopera
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SoccerWolrdCupControllerTest {

	@Autowired
	private SoccerWolrdCupController controller;

	@Test
	public void contextLoads() {
		assertThat(controller).isNotNull();
	}

	@Test
	public void getsoccerWorldCupsByWinnersTest() {
		assertTrue(controller.getSoccerWorldCupsByWinnersJSON(5).size() == 5);
	}

}
