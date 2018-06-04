package org.wmsrest.config;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("webapi")
public class RestConfig extends Application{

	public RestConfig() {
		
	}
	
	/*@Override
	public Set<Class<?>> getClasses() {
		return new HashSet<>(Arrays.asList(
				MyResource.class
				));
	}*/
}
