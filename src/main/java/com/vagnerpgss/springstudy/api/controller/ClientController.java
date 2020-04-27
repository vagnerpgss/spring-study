package com.vagnerpgss.springstudy.api.controller;

import java.util.Collections;
import java.util.List;

import com.vagnerpgss.springstudy.domain.model.Client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
    
    @GetMapping("/clients")
    public List<Client> listar() {
        return Collections.emptyList();
    }

}