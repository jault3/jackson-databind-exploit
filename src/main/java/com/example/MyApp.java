package com.example;

import com.example.resources.MyResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class MyApp extends Application<MyConfig> {

    public static void main(String[] args) throws Exception {
        new MyApp().run(args);
    }

    @Override
    public String getName() {
        return "break-all-the-things";
    }

    @Override
    public void initialize(Bootstrap<MyConfig> bootstrap) {
        // nothing to do yet
        bootstrap.getObjectMapper().enableDefaultTyping();
    }

    @Override
    public void run(MyConfig configuration, Environment environment) {
        final MyResource resource = new MyResource();
        environment.jersey().register(resource);
    }
}
