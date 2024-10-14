package com.cbuthsara.lil.learning_spring.data;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends CrudRepository<Guest, Long> {

}
