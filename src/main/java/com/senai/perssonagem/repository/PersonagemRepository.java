package com.senai.perssonagem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.perssonagem.model.Personagem;

@Repository
public interface PersonagemRepository extends JpaRepository<Personagem, Integer> {

    // A classe repository é uma interface entre o modelo com o banco de dados.
    // A classe preository para ser uma interface que extends outra interface JPA:
    // JpaRepository.
    // A intidade que precisamos passar para que faça todo o crud desta classe
    // <Personage(Nome da classe) e Integer(Que é o ID da classe)
    // @Repository para ele ser um SpringBean, um componente que terá a
    // caracteristica de representar um repositório no projeto.
}
