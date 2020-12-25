package com.coffeemachine.models;

import java.util.List;

public class Machine {

	private long id;
	private boolean isTurnedOn;
	private double sumChange;
	private List<Product> products;
	
	public Machine(long id) {
		super();
		this.id = id;
		this.isTurnedOn = false;
		this.sumChange = 0.0;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public boolean isTurnedOn() {
		return isTurnedOn;
	}

	public void setTurnedOn(boolean isTurnedOn) {
		this.isTurnedOn = isTurnedOn;
	}

	public double getSumChange() {
		return sumChange;
	}

	public void setSumChange(double sumChange) {
		this.sumChange = sumChange;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Machine [id=" + id + ", isTurnedOn=" + isTurnedOn + ", sumChange=" + sumChange + ", products="
				+ products + "]";
	}
}
