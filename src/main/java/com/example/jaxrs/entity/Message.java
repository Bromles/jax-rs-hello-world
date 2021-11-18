package com.example.jaxrs.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "messages")
public class Message implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "data")
    private String data;

    public Message(String data, Long id) {
        this.data = data;
        this.id = id;
    }

    public Message(MessageDTO dto) {
        this.data = dto.getData();
    }

    public Message(String data) {
        this.data = data;
    }

    public Message() {
    }

    public String getData() {
        return data;
    }

    public void setData(String message) {
        this.data = message;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public MessageDTO toDTO() {
        return new MessageDTO(this.data);
    }
}