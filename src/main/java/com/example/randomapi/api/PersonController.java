package com.example.randomapi.api;

import com.example.randomapi.dto.Person;
import com.example.randomapi.repository.mongo.PersonMongoRepository;
import com.example.randomapi.service.PersonService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/person")
public class PersonController {
    @Autowired
    private PersonService service;

    @Autowired
    PersonMongoRepository personMongoRepository;

    @GetMapping()
    public ResponseEntity<?> listPerson() {
        return new ResponseEntity<>(service.getListPerson(), HttpStatus.OK);
    }

    @PostMapping("/publish")
    public ResponseEntity<?> publishPerson(@RequestBody Person person) {
        return new ResponseEntity<>(this.service.publishPerson(person), HttpStatus.OK);
    }

    @GetMapping("/find")
    public ResponseEntity<?> findPersonByName(String name){
        return new ResponseEntity<>(personMongoRepository.findAllByName(name), HttpStatus.OK);
    }
}
