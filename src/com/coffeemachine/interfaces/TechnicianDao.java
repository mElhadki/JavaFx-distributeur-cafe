package com.coffeemachine.interfaces;

import java.util.List;

import com.coffeemachine.models.Technician;

public interface TechnicianDao {

	public String AddTechnician(List<Technician> technicians,Technician technician) throws Exception;
	
}
