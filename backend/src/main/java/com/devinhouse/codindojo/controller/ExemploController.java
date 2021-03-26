package com.devinhouse.codindojo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/exemplo")

public class ExemploController {

    @GetMapping(path = "/teste")
    public String teste() {
        return "FUNCIONANDO !!!";
    }

}
