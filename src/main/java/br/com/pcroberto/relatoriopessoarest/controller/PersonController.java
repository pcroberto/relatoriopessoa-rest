package br.com.pcroberto.relatoriopessoarest.controller;

import br.com.pcroberto.relatoriopessoarest.model.Person;
import br.com.pcroberto.relatoriopessoarest.repository.PersonRepository;
import br.com.pcroberto.relatoriopessoarest.util.CpfValidator;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {

    private final PersonRepository personRepository;

    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping("/persons")
    List<Person> all() {
        return personRepository.findAll();
    }

    @PostMapping("/person")
    Person newPerson(@RequestBody Person newPerson) throws Exception{
        if (!CpfValidator.isCPF(newPerson.getCpf())) {
            throw new Exception("CPF inválido");
        }

        return personRepository.save(newPerson);
    }
}
