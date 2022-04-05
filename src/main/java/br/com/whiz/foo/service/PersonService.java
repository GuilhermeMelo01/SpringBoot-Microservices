package br.com.whiz.foo.service;

import br.com.whiz.foo.model.Person;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service  //Faz a injeção de dependecias dessa class onde for necessary
public class PersonService {
    
    private final AtomicLong counter = new AtomicLong();

    public Person findById(String id){
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Guilherme");
        person.setLastName("Melo");
        person.setAddress("Caucaia - CE");
        person.setGender("Male");
        return person;
    }
}
