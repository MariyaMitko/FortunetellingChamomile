package by.mitsko.fortunetellingCamomile.logic;

import java.util.LinkedList;
import java.util.Scanner;

import by.mitsko.fortunetellingCamomile.bean.Client;

public class ClientJournal {
    
	private LinkedList<Client> clients = new LinkedList<>();

	public LinkedList<Client> getClients() {
		return clients;
	}

	public void setClients(LinkedList<Client> clients) {
		this.clients = clients;
	}

	public void writeClient(Client client){
			
		if (clients.contains(client)){
			System.out.println("Visit me tomorrow");
		}else{
			clients.add(client);
			FortuneTeller teller = new FortuneTeller();
			teller.createChamomiles();
			teller.createPredictions();
			teller.readFortune();
		}
	}
}
