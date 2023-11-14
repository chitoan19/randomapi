package com.example.randomapi.service;

import com.example.randomapi.dto.Person;
import com.example.randomapi.kafka.publish.PersonPublishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import static com.example.randomapi.kafka.Constants.TOPIC_PERSON;

@Service
public class PersonService {
    private final PersonPublishService personPublishService;

    public PersonService(PersonPublishService personPublishService) {
        this.personPublishService = personPublishService;
    }

    public List<Person> getListPerson() {
        List<Person> result = new ArrayList<>();
        result.add(new Person("Toan", "Bac Ninh", 24, new Date("09/11/1999")));
        result.add(new Person("Toan1", "Bac Ninh", 25, new Date("09/11/1999")));
        result.add(new Person("Toan2", "Bac Ninh", 26, new Date("09/11/1999")));
        result.add(new Person("Toan3", "Bac Ninh", 27, new Date("09/11/1999")));
        return result;
    }

    public String publishPerson(Person person){
        this.personPublishService.publish(TOPIC_PERSON, person);
        return "Publish person to kafka success";
    }
}
