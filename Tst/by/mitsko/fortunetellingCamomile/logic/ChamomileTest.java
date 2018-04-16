package by.mitsko.fortunetellingCamomile.logic;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import by.mitsko.fortunetellingCamomile.bean.Chamomile;



public class ChamomileTest {
	private FortuneTeller teller;

	@Before
	public void initTestData(){

	teller = new FortuneTeller();
	teller.createChamomiles();
	}
	@Test
	public void test() {
	for (Chamomile chamomile : teller.getChamomiles()) {
			assertTrue(chamomile.getPetal() >= 0 && chamomile.getPetal() < 11);
	}
	}
}
