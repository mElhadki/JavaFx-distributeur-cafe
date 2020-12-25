package com.coffeemachine.models;

public class Technician extends Person{

	private String idRef;
	private String accessCode;
	
	public Technician() {
		
	}
	public Technician(long id, String name, String phone, String idRef, String accessCode) {
		super(id, name, phone);
		this.idRef = idRef;
		this.accessCode = accessCode;
	}

	public String getIdRef() {
		return idRef;
	}
	public void setIdRef(String idRef) {
		this.idRef = idRef;
	}

	public String getAccessCode() {
		return accessCode;
	}

	public void setAccessCode(String accessCode) {
		this.accessCode = accessCode;
	}

	@Override
	public String toString() {
		return "Technician ["+super.toString()+" idRef=" + idRef + ", accessCode=" + accessCode + "]";
	}
}
