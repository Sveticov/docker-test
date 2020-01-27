package com.svetikov.dockertest.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class DockerController {
    @GetMapping("/docker/{mess}")
    public ResponseEntity<String>  dock(@PathVariable("mess") String  mess) {
        return new ResponseEntity<>("test docker "+mess, HttpStatus.OK);
    }
}
