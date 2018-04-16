package by.mitsko.fortunetellingCamomile.logic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

import by.mitsko.fortunetellingCamomile.bean.Chamomile;


public class FortuneTeller {
   
	private String pred;
	private HashMap <String, List<String>> predictions = new HashMap<>();
	private HashSet <Chamomile> chamomiles;
	private int chamomilesCount;
	
	public HashSet<Chamomile> getChamomiles() {
		return chamomiles;
	}
	public void setChamomiles(HashSet<Chamomile> chamomiles) {
		this.chamomiles = chamomiles;
	}
	public int getChamomilesCount() {
		return chamomilesCount;
	}
	public void setChamomilesCount(int chamomilesCount) {
		this.chamomilesCount = chamomilesCount;
	}
	
	public HashMap<String, List<String>> getPredictions() {
		return predictions;
	}
	public void setPredictions(HashMap<String, List<String>> predictions) {
		this.predictions = predictions;
	}
	public String choosePrediction(){
	    	Scanner sc = new Scanner(System.in);
	    	System.out.println("Choose your prediction type: Love, Money, Health");
	    	pred = sc.next();
	    	return pred;
	    }
	
	public void createChamomiles() {
		chamomilesCount = (int) (1+ Math.random() * 10);
		chamomiles = new HashSet<>();
		for (int i = 1; i <= chamomilesCount; i++) {
			chamomiles.add(new Chamomile((int)(Math.random()*10)));
		}
		
	}
		
	public void createPredictions() {
	    predictions.put("Love", Arrays.asList("Love", "Do not love","Changes in the relationsips"));
	    predictions.put("Money", Arrays.asList("Salary increase are waiting foy you", "You have to expensive bying", "Pay attention, you may lose the wallet"));
    	predictions.put("Health", Arrays.asList("You have cast-iron physique", "You need to visit the gym", "You need to visit the doctor? take care"));
    	    	}

	public void readFortune() {
		ArrayList<Chamomile> cm = new ArrayList<>();
		cm.addAll(chamomiles);
		Chamomile chamomile = cm.get(0);
		if (chamomile == null){
			System.out.println("My flower are ended");
		}else{
		if (chamomile.getPetal() == 0) {
			System.out.println("Sorry, this flower is faded, try again");
			return;
		}
		switch (choosePrediction()) {
		    case "Love":
			  predLove(chamomile);
			  chamomiles.remove(chamomile);
			  break;
		    case "Money":
			  predMoney(chamomile);
			  chamomiles.remove(chamomile);
			  break;
		    case "Health":
		      predHealth(chamomile);
		      chamomiles.remove(chamomile);
			  break;
		}
	}
	}
	public void predLove(Chamomile chamomile){
		if (chamomile.getPetal() % 3 == 0) {
			System.out.println("Your prediction is: " + predictions.get("Love").get(0));
		} else if (chamomile.getPetal() % 3 == 1) {
			System.out.println("Your prediction is: " + predictions.get("Love").get(1));
		} else if (chamomile.getPetal() % 3 == 2) {
			System.out.println("Your prediction is: " + predictions.get("Love").get(2));
		}
	}
	
	public void predMoney(Chamomile chamomile){
	   if (chamomile.getPetal() % 3 == 0) {
	  	System.out.println("Your prediction is: " + predictions.get("Money").get(0));
	  } else if (chamomile.getPetal() % 3 == 1) {
	 	System.out.println("Your prediction is: " + predictions.get("Money").get(1));
	  } else if (chamomile.getPetal() % 3 == 2) {
		System.out.println("Your prediction is: " + predictions.get("Money").get(2));
	}
}
	
	public void predHealth(Chamomile chamomile){
		   if (chamomile.getPetal() % 3 == 0) {
		  	System.out.println("Your prediction is: " + predictions.get("Health").get(0));
		  } else if (chamomile.getPetal() % 3 == 1) {
		 	System.out.println("Your prediction is: " + predictions.get("Health").get(1));
		  } else if (chamomile.getPetal() % 3 == 2) {
			System.out.println("Your prediction is: " + predictions.get("Health").get(2));
		}
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((chamomiles == null) ? 0 : chamomiles.hashCode());
		result = prime * result + chamomilesCount;
		result = prime * result + ((pred == null) ? 0 : pred.hashCode());
		result = prime * result
				+ ((predictions == null) ? 0 : predictions.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FortuneTeller other = (FortuneTeller) obj;
		if (chamomiles == null) {
			if (other.chamomiles != null)
				return false;
		} else if (!chamomiles.equals(other.chamomiles))
			return false;
		if (chamomilesCount != other.chamomilesCount)
			return false;
		if (pred == null) {
			if (other.pred != null)
				return false;
		} else if (!pred.equals(other.pred))
			return false;
		if (predictions == null) {
			if (other.predictions != null)
				return false;
		} else if (!predictions.equals(other.predictions))
			return false;
		return true;
	}
	
}
