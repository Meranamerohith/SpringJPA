package com.sathya.orm.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonDetails {
	 private int id;
	 private String firstName;
	 private String lastName;
	 private String email;
	 private int age;
}
