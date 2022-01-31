package org.sebi;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.config.inject.ConfigProperty;

@Path("/hello")
public class HelloResource {

    @ConfigProperty(name="deployment")
    String deployment;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello OpenShift Developer Sandbox, this has been deployed with : " + deployment;
    }
}