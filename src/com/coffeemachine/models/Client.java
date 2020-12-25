package com.coffeemachine.models;

public class Client extends Person{

	private String choice;
	private double coins;
	private double rest;
	
	public Client(long id, String name, String phone, String choice, double coins,double rest) {
		super(id, name, phone);
		this.choice = choice;
		this.coins = coins;
		this.rest=rest;
	}

	public String getChoice() {
		return choice;
	}

	public void setChoice(String choice) {
		this.choice = choice;
	}

	public double getCoins() {
		return coins;
	}

	public void setCoins(double coins) {
		this.coins = coins;
	}

	public double getRest() {
		return rest;
	}

	public void setRest(double rest) {
		this.rest = rest;
	}

	@Override
	public String toString() {
		return "Client ["+super.toString()+" choice=" + choice + ", coins=" + coins + ", rest=" + rest + "]";
	}
}
