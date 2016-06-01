package tp7;

import javax.annotation.security.RolesAllowed;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class Hello {
    @GET
    @Path("/res1")
    @RolesAllowed("tomcat")
    @Produces(MediaType.TEXT_PLAIN)
    public String direBonjour1(@QueryParam("nom") String s) {
        return "Hello res1 " + s;
    }

    @GET
    @Path("/res2")
    @RolesAllowed("admin")
    @Produces(MediaType.TEXT_PLAIN)
    public String direBonjour2(@QueryParam("nom") String s) {
        return "Hello res2 " + s;
    }
}
