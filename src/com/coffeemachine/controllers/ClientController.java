package com.coffeemachine.controllers;

import java.util.List;

import com.coffeemachine.interfaces.ClientDao;
import com.coffeemachine.models.Client;

public class ClientController implements ClientDao{

	@Override
	public String AddClient(List<Client> clients,Client client) throws Exception{
		if(client != null) {
			clients.add(client);
			return "Client added ! \n  ---------------- ";
		}else {
			return "Error while adding client !";
		}
			
	}

}
