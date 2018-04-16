package by.mitsko.fortunetellingCamomile.logic;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class FortuneTellerTypeTest {
	private FortuneTeller teller;

	@Before
	public void initTestData(){
	
	teller = new FortuneTeller();
	teller.createPredictions();
	
	}
		
	@Test
	public void test() {
		String predictionType = teller.choosePrediction();
		assertTrue(teller.getPredictions().containsKey(predictionType));
	}

}
