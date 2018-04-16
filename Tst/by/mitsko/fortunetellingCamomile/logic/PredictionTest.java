package by.mitsko.fortunetellingCamomile.logic;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import by.mitsko.fortunetellingCamomile.bean.Client;

public class PredictionTest {
    
private FortuneTeller teller;
private ClientJournal cj;
private Client client;


	@Before
	public void initTestData(){
		
	
	teller = new FortuneTeller();
	cj = new ClientJournal();
	client = new Client("Ivan", "10.02.2018");
	client = new Client("Ivan", "10.02.2018");
	cj.writeClient(client);
	
	}
	
	@Test
	public void test() {
       	  
		
		
		
	}

}
