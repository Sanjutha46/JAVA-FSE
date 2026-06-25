package com.cognizant.spring.learn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cognizant.spring.learn.model.Country;

public interface CountryRepository
        extends JpaRepository<Country, String> {

}
