package com.neoleap.neoleapers.services;

import com.neoleap.neoleapers.model.Country;
import com.neoleap.neoleapers.repository.CountryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {


    private final CountryRepository countryRepository;

    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }


    public List<Country> getAllCountries () {

        return  countryRepository.findAll();
    }

    public Country saveCountry(Country cn) {
        System.out.println("Employee created successfully !!");
        return countryRepository.save(cn);
    }
}
