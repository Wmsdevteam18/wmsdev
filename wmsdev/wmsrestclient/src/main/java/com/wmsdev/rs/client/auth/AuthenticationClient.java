package com.wmsdev.rs.client.auth;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.stereotype.Component;

import wmsdata.UserBean;

@Component
public class AuthenticationClient {
	
	public boolean authenticate(UserBean bean) {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080/wmsrest/webapi/login");
		Response response =  target.request().post( Entity.entity(bean, MediaType.APPLICATION_JSON));
		return response.getStatus() == Status.OK.getStatusCode();
	}
}
