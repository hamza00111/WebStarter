package com.starter.mvc.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.starter.mvc.models.AbstractLoggedModel;

public interface Dao extends Repository<AbstractLoggedModel, Long> {
	
	@Query("SELECT model FROM  MODEL WHERE model.id =:id")
    @Transactional(readOnly = true)
    AbstractLoggedModel findById(@Param("id") Long id);
}
