package com.sathya.orm.mapper;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

import com.sathya.orm.Person;
import com.sathya.orm.model.PersonDetails;
@Component
public class PersonMapper {

	
	public Person modeltoEntityConversion(PersonDetails personDetails) {
		
		Person person =  new Person();
		
		person.setFirstName(personDetails.getFirstName());
		person.setLastName(personDetails.getLastName());
		person.setEmail(personDetails.getEmail());
		person.setAge(personDetails.getAge());
		person.setCreateBy(System.getProperty("user.name"));
	    person.setCreateAt(LocalDateTime.now());
	
		return person;
	}
}
