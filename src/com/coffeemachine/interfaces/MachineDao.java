package com.coffeemachine.interfaces;

import java.util.List;

import com.coffeemachine.models.Machine;
import com.coffeemachine.models.Product;

public interface MachineDao {
	
	public String AddMachine(List<Machine> machines, Machine machine) throws Exception;
	public String StartMachine(List<Product> products,Machine machine,double sumChange) throws Exception;
	public List<Product> ShowMachineItems(Machine machine) throws Exception;
}
