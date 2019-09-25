package br.com.pcroberto.relatoriopessoarest.repository;

import br.com.pcroberto.relatoriopessoarest.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
