package com.example.Spring_postgres;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcRepository extends CrudRepository<Proc, Long> {

}