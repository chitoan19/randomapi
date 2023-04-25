package com.example.randomapi.api;

import com.example.randomapi.dto.Person;
import com.example.randomapi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/person")
public class PersonController {
    @Autowired
    private PersonService service;

    @GetMapping()
    public ResponseEntity<?> listPerson(){
        return new ResponseEntity<>(service.getListPerson(), HttpStatus.OK);
    }
}
