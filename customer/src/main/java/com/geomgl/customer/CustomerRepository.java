package com.geomgl.customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// note that the params for JpaRepository, the type of the entity being stored and datatype for that entity's id
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> { }
