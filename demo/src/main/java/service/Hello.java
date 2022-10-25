package service;

import org.springframework.stereotype.Service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/hello")
public class Hello {

    @GET
    @Produces("text/plain")
    public String hello() {
        return "Hello from Spring";
    }

}
