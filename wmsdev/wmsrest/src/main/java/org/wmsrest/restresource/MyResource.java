package org.wmsrest.restresource;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.wmsjeb.beans.SBeanRemote;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {
	
	@EJB (lookup="java:global/wmsear-0.0.1-SNAPSHOT/wmsejb-0.0.1-SNAPSHOT/SBean!com.wmsjeb.beans.SBeanRemote")
	SBeanRemote bean;
    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it!"+(bean != null ? bean.ejbMessage() : "ejb injection failed");
    }
}
