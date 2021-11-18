package com.example.jaxrs.entity;

public class MessageDTO {
    private String data;

    public MessageDTO(String data) {
        this.data = data;
    }

    public MessageDTO() {
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}