package config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import service.Hello;

@Component
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig(){
        register(Hello.class);
    }
}
