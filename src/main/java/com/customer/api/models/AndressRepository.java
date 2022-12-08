package com.customer.api.models;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface AndressRepository extends CrudRepository<Andress, String> {

}
