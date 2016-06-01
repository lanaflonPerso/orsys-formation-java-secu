package tp7;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.filter.RolesAllowedDynamicFeature;

import javax.ws.rs.ApplicationPath;

/**
 * Created by Administrateur on 01/06/2016.
 */
@ApplicationPath("/rest/*")
public class MyAppResourceConfig extends ResourceConfig {
    public MyAppResourceConfig() {
        super(Hello.class);
        register(RolesAllowedDynamicFeature.class);
    }
}
