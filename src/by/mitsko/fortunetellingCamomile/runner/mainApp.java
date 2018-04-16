package by.mitsko.fortunetellingCamomile.runner;

import java.util.LinkedList;

import by.mitsko.fortunetellingCamomile.bean.Client;
import by.mitsko.fortunetellingCamomile.logic.ClientJournal;
import by.mitsko.fortunetellingCamomile.logic.FortuneTeller;


public class mainApp {

	public static void main(String[] args) {
		


	
	    ClientJournal  cj = new ClientJournal();
	
		Client cl1 = new Client("Ivan", "10.02.2018");
		cj.writeClient(cl1);
		Client cl2 = new Client("Ivan", "10.02.2018");
		cj.writeClient(cl2);
		Client cl3 = new Client("Ivan", "10.03.2018");
		cj.writeClient(cl3);
		
}
}