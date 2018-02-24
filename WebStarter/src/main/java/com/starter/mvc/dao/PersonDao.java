package com.starter.mvc.dao;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.starter.mvc.models.PersonModel;

public interface PersonDao<T extends PersonModel, Long> extends Dao {

	@Query("SELECT person FROM PERSON WHERE person.firstName LIKE %:firstName%")
    @Transactional(readOnly = true)
	public Collection<PersonModel> findByFirstName(String firstName);
	
	@Query("SELECT person FROM PERSON WHERE person.lastName LIKE %:lastName%")
    @Transactional(readOnly = true)
	public Collection<PersonModel> findByLastName(String lastName);
		
}
