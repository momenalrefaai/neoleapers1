package com.neoleap.neoleapers.controller;

import com.neoleap.neoleapers.model.Country;
import com.neoleap.neoleapers.services.CountryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api")
public class CountryController {

    private CountryService country;

    @GetMapping("/countries")
    public List<Country> getAllCountries (){

        return country.getAllCountries();
    }

    @GetMapping("/addCountry")
    public Country addCountry (){

        Country insertDefualtCountry = new Country();
        insertDefualtCountry.setId(1);
        insertDefualtCountry.setName("Jordan");
        insertDefualtCountry.setCreated_at(LocalDateTime.now());

        return country.saveCountry(insertDefualtCountry);
    }
}
