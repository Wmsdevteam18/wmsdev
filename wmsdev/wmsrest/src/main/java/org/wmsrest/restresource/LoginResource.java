package org.wmsrest.restresource;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.wmsjeb.beans.LoginServiceBeanRemote;

import wmsdata.UserBean;

/*
 * First flow:
 * 
 * @Stateless enables ejb enjection with @EJB with no lookup
 * Attempts to inject NO interface view and location interfaces failed.
 * 
 */

//@Stateless
@Path("/login")
public class LoginResource {
	
	//@EJB(lookup="java:global/wmsear-0.0.1-SNAPSHOT/wmsejb-0.0.1-SNAPSHOT/LoginServiceBean!com.wmsjeb.beans.LoginServiceBeanRemote") 
	@EJB(lookup="java:app/wmsejb-0.0.1-SNAPSHOT/LoginServiceBean!com.wmsjeb.beans.LoginServiceBeanRemote") 
	LoginServiceBeanRemote loginService;
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response login(UserBean userBean ) {
		if( loginService.authenticate(userBean) )
			return Response.ok("OK").build();
		else
			return Response.status(Status.UNAUTHORIZED).entity("Invalid Credentials").build();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response sample() {
		UserBean userBean  = new UserBean();
		userBean.setUserName("pavan");
		userBean.setPassword("pavan");
		return Response.ok(userBean).build();
	}
}
