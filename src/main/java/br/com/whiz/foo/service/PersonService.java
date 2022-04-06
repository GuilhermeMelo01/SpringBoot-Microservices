package br.com.whiz.foo.service;

import br.com.whiz.foo.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service  //Faz a injeção de dependecias dessa class onde for necessary
public class PersonService {
    
    private final AtomicLong counter = new AtomicLong();

    public Person update(Person person){
        return person;
    }

    public Person create(Person person){
        return person;
    }

    public void delete(String id){
    }

    public Person findById(String id){
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Guilherme");
        person.setLastName("Melo");
        person.setAddress("Caucaia - CE");
        person.setGender("Male");
        return person;
    }

    public List<Person> findAll(){
        List<Person> persons = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            Person person = mockPerson(i);
            persons.add(person);
        }
        return persons;
    }

    private Person mockPerson(int i) {
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("first name" + i);
        person.setLastName("last name" + i);
        person.setAddress("some place in Brazil" + i);
        person.setGender("Male");
        return person;
    }
}
