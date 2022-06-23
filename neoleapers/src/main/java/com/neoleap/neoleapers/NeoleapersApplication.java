package com.neoleap.neoleapers;

import com.neoleap.neoleapers.domain.Student;
import com.neoleap.neoleapers.model.Country;
import com.neoleap.neoleapers.repository.CountryRepository;
import com.neoleap.neoleapers.services.CountryService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;

@SpringBootApplication
public class NeoleapersApplication {

	public static void main(String[] args) {
		SpringApplication.run(NeoleapersApplication.class, args);

	}

}
