package com.coffeemachine.controllers;

import java.util.List;

import com.coffeemachine.interfaces.MachineDao;
import com.coffeemachine.models.Machine;
import com.coffeemachine.models.Product;

public class MachineController implements MachineDao{

	@Override
	public String StartMachine(List<Product> products,Machine machine,double sumChange) throws Exception {
		machine.setTurnedOn(true);
		machine.setProducts(products);
		machine.setSumChange(sumChange);
		return "Machine started ! \n  ---------------- \n Please select your item : \n ";
	}

	@Override
	public String AddMachine(List<Machine> machines,Machine machine) throws Exception {
		if(machine != null) {
			machines.add(machine);
			return "Machine Added ! \n  ---------------- ";
		}else {
			return "Error while adding machine";
		}
		
	}

	@Override
	public List<Product> ShowMachineItems(Machine machine) throws Exception {
		if(machine != null) {
			return machine.getProducts();
		}else {
			return null;
		}
	}

}
