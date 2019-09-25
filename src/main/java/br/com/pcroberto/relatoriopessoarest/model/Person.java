package br.com.pcroberto.relatoriopessoarest.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.validator.constraints.Length;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@EqualsAndHashCode(callSuper = false)
@Entity
@Data
public class Person extends AbstractEntity{
    @NotNull(message = "Nome não informado.")
    private String firstName;

    @NotNull(message = "Sobrenome não informado.")
    private String lastName;

    @Length(max = 10, min = 10, message = "O campo de telefone fixo deve ter 10 dígitos.")
    @NotNull(message = "Telefone residencial não informado.")
    private String homephone;

    @Length(max = 10, min = 10, message = "O campo de telefone celular deve ter 10 dígitos.")
    @NotNull(message = "Telefone celular não informado.")
    private String cellphone;

    @Length(max = 11, min = 11)
    @Pattern(regexp = "[0-9]+")
    @NotNull(message = "CPF não informado.")
    private String cpf;
}
