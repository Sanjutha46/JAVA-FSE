package com.example;

import com.example.entity.Country;
import com.example.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CountryTest implements CommandLineRunner {

    @Autowired
    private CountryService countryService;

    @Override
    public void run(String... args) {

        System.out.println("Find Country By Code");
        System.out.println(countryService.findCountryByCode("IN"));

        countryService.addCountry(
                new Country("NP", "Nepal")
        );

        countryService.updateCountry(
                new Country("NP", "Federal Democratic Republic of Nepal")
        );

        System.out.println("Countries containing 'Ind'");

        countryService.searchCountries("Ind")
                .forEach(c -> System.out.println(c.getName()));

        countryService.deleteCountry("NP");
    }
}
