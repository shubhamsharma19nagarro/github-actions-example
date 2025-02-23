package com.javatechie.cicd.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeploymentController {

    @GetMapping({"/hello"})
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello");
    }

}
