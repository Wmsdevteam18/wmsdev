package com.auth.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import wmsdata.UserBean;

public class AuthenticationClient {
	
	public boolean authenticate(UserBean bean) {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080/wmsrest/webapi/login");
		return true;
	}
}
