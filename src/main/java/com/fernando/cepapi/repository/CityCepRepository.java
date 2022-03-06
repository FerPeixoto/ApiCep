package com.fernando.cepapi.repository;

import com.fernando.cepapi.model.CityCep;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityCepRepository extends JpaRepository<CityCep, Long> {

}
