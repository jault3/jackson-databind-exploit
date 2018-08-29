package com.example.resources;

import com.example.models.MyObject;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/echo")
@Produces(MediaType.APPLICATION_JSON)
public class MyResource {

    public MyResource() {
    }

    @POST
    public MyObject sayHello(MyObject obj) throws Exception {
        return obj;
    }
}
