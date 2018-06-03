package org.wmsrest.config;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import org.wmsrest.restresource.MyResource;

@ApplicationPath("webapi")
public class RestConfig extends Application{

	public RestConfig() {
		
	}
	
	@Override
	public Set<Class<?>> getClasses() {
		return new HashSet<>(Arrays.asList(
				MyResource.class
				));
	}
}
