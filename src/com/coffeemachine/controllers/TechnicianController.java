package com.coffeemachine.controllers;

import java.util.List;

import com.coffeemachine.interfaces.TechnicianDao;
import com.coffeemachine.models.Technician;

public class TechnicianController implements TechnicianDao{

	@Override
	public String AddTechnician(List<Technician> technicians, Technician technician) throws Exception {
		if(technician != null) {
			technicians.add(technician);
			return "technician added ! \n  ---------------- ";
		}else {
			return "Error while adding technician !";
		}
			
	}

}
