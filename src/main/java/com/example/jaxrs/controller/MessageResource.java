package com.example.jaxrs.controller;

import com.example.jaxrs.entity.MessageDTO;
import com.example.jaxrs.service.IMessageService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("")
public class MessageResource {
    @Inject
    private IMessageService service;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<MessageDTO> hello() {
        return service.getHelloJson();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void addMessage(MessageDTO messageDTO) {
        service.addMessage(messageDTO);
    }
}