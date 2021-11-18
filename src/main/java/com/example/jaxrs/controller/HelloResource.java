package com.example.jaxrs.controller;

import com.example.jaxrs.service.IHelloService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("")
public class HelloResource {
    @Inject
    private IHelloService service;

    @GET
    @Produces("application/json")
    public String hello() {
        return service.getHelloJson();
    }
}