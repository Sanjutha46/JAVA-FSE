package com.cognizant.springlearn.service;

import com.cognizant.springlearn.Country;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class CountryService {

    private List<Country> countryList;

    public CountryService() {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("country.xml");

        Country[] countries = (Country[]) context.getBean("countryList");

        countryList = Arrays.asList(countries);
    }

    public Country getCountry(String code) {

        return countryList.stream()
                .filter(c -> c.getCode().equalsIgnoreCase(code))
                .findFirst()
                .orElse(null);
    }

}
