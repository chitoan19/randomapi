package com.example.randomapi.service;

import com.example.randomapi.dto.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PersonService {
    public List<Person> getListPerson(){
        List<Person> result = new ArrayList<>();
        result.add(new Person("Toan", "Bac Ninh", 24, new Date("09/12/1999")));
        result.add(new Person("Toan1", "Bac Ninh", 25, new Date("09/12/1999")));
        result.add(new Person("Toan2", "Bac Ninh", 26, new Date("09/12/1999")));
        result.add(new Person("Toan3", "Bac Ninh", 27, new Date("09/12/1999")));
        return result;
    }
}
