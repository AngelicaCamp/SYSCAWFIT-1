package com.syscawfit.syscawfit.model;

import lombok.*;

import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Date;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "O campo nome deve ser preenchido.")
    private String nome;

    @NotBlank(message = "O campo CPF deve ser preenchido.")
    @Column(unique = true)
    private String cpf;

    private String imagemAluno;

    @NotBlank(message = "O campo telefone deve ser preenchido.")
    private String telefone;

    @NotBlank(message = "O campo e-mail deve ser preenchido.")
    @Email(message = "Endereço de e-mail enviado em um formato inválido. ")
    private String email;

    @NotNull(message = "O campo data de nascimento não deve ser nulo.")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dataNascimento;

    @NotNull (message = "O campo tipo de plano não deve ser vazio.")
    private TipoPlano plano;

    private LocalDate dataIngresso = LocalDate.now();

    @OneToOne(cascade = CascadeType.REMOVE)
    private EnderecoAluno endereco;


}
