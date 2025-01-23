package com.sap.taskcenter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoContoller {
    @GetMapping("/home")
    public String getDummy() {
        return "Hello World";
    }
}
