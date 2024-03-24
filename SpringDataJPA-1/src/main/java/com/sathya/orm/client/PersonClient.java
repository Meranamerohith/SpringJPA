package com.sathya.orm.client;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sathya.orm.Person;
import com.sathya.orm.mapper.PersonMapper;
import com.sathya.orm.model.PersonDetails;
import com.sathya.orm.repository.PersonRepository;
@Component
public class PersonClient implements CommandLineRunner {
	
	
	@Autowired
	PersonRepository personRepository;
	
	
	@Autowired
	PersonMapper mapper;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		PersonDetails personDetails =new PersonDetails();
		personDetails.setFirstName("Ambati");
		personDetails.setLastName("Sai Rohith");
		personDetails.setEmail("whoareyou@gmail.com");
		personDetails.setAge(28);
		
		
		Person p1 = mapper.modeltoEntityConversion(personDetails);
		
		personRepository.save(p1);
	}
}
