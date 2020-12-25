package com.coffeemachine.models;

public class Person {

	private long id;
	private String name;
	private String phone;
	
	public Person() {
		
	}
	public Person(long id, String name, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", phone=" + phone + "";
	}
}
