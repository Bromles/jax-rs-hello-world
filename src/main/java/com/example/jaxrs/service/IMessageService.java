package com.example.jaxrs.service;

import com.example.jaxrs.entity.MessageDTO;

import java.util.List;

public interface IMessageService {
    List<MessageDTO> getHelloJson();

    void addMessage(MessageDTO messageDTO);
}