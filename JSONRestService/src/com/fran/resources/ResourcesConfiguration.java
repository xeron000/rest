package com.fran.resources;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("resources")
public class ResourcesConfiguration extends ResourceConfig {
	public ResourcesConfiguration() {
		packages("com.fran.resources");
	}
}
