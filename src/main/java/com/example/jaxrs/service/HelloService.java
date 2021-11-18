package com.example.jaxrs.service;

import javax.enterprise.context.ApplicationScoped;
import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;

@ApplicationScoped
public class HelloService implements IHelloService {

    @Override
    public String getHelloJson() {
        try(Jsonb jsonb = JsonbBuilder.create()) {
            return jsonb.toJson("Hello, World!");
        }
        catch (Exception ex) {
            return "Something went wrong";
        }
    }
}