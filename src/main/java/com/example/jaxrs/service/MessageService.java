package com.example.jaxrs.service;

import com.example.jaxrs.entity.Message;
import com.example.jaxrs.entity.MessageDTO;
import com.example.jaxrs.repository.IMessageRepository;

import javax.enterprise.context.ApplicationScoped;

import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class MessageService implements IMessageService {

    @Inject
    private IMessageRepository repository;

    @Override
    public List<MessageDTO> getHelloJson() {
        return repository.findAll().stream().map(Message::toDTO).collect(Collectors.toList());
    }

    @Override
    public void addMessage(MessageDTO messageDTO) {
        repository.save(new Message(messageDTO));
    }
}