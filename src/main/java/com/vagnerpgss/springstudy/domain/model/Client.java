package com.vagnerpgss.springstudy.domain.model;

import lombok.Data;

@Data
public class Client {

    private final Long id;
    private final String nome;
    private final String email;
    private final String phone;

}