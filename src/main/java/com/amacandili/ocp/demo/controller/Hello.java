package com.amacandili.ocp.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping("hello/{name}")
    public String sayHello(@PathVariable("name") String name) {
        return String.format("Hello %s!", name);
    }
}
