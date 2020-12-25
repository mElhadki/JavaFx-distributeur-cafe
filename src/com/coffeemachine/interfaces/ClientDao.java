package com.coffeemachine.interfaces;

import java.util.List;

import com.coffeemachine.models.Client;

public interface ClientDao {

	public String AddClient(List<Client> clients,Client client) throws Exception;
	
}
