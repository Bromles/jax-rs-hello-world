package com.example.jaxrs.repository;

import com.example.jaxrs.entity.Message;

import java.util.List;

public interface IMessageRepository {
    void save(Message message);

    List<Message> findAll();
}