package by.mitsko.fortunetellingCamomile.logic;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import by.mitsko.fortunetellingCamomile.bean.Chamomile;

public class TestChamomileCount {
	
private FortuneTeller teller;
	
	@Before
	public void initTestData(){
	
	teller = new FortuneTeller();
	teller.createChamomiles();
	}
	@Test
	public void test() {
		assertTrue(teller.getChamomilesCount()> 0 && teller.getChamomilesCount() < 11);
		
	}

}
