package hu.unideb.inf.springdatafx_m12;

import hu.unideb.inf.springdatafx_m12.model.Person;
import hu.unideb.inf.springdatafx_m12.model.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class SpringDataFxM12Application implements CommandLineRunner {
    @Autowired
    PersonRepository personRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataFxM12Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        /*Person person = new Person();
        person.setName("Alex Smith");
        person.setDateOfBirth(LocalDate.of(2002,11,9));*/

        Person person = Person.builder()
                    .name("Alex Smith")
                    .dateOfBirth(LocalDate.of(2003,3,3))
                .build();

        personRepository.save(person);
    }
}
