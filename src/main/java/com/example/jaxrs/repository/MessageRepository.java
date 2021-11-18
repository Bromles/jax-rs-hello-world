package com.example.jaxrs.repository;

import com.example.jaxrs.entity.Message;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class MessageRepository implements IMessageRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public void save(Message message) {
        entityManager.persist(message);
    }

    @Override
    public List<Message> findAll() {
        return entityManager.createQuery("select m from Message m").getResultList();
    }
}