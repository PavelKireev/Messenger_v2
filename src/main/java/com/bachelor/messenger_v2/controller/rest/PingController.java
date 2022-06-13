package com.bachelor.messenger_v2.controller.rest;

import com.bachelor.messenger_v2.service.api.EjabberdApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class PingController {

    private final EjabberdApiService service;

    @Autowired
    public PingController(
        EjabberdApiService service
    ) {
        this.service = service;
    }

    @GetMapping("/ping")
    public void pong(){
        System.out.println(service.ping());
    }
}
