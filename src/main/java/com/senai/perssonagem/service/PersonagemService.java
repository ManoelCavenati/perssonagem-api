package com.senai.perssonagem.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.perssonagem.model.Personagem;
import com.senai.perssonagem.repository.PersonagemRepository;

// Classes Service é onde ficam as regras de negócios e toda lógica da aplicação.
@Service // Componente SpringBean que gerencia a classe de forma explícita de regras de
         // negócio.
public class PersonagemService {

    @Autowired
    private PersonagemRepository repository;

    public List<Personagem> consultar() {
        return repository.findAll(); // Recurso do Sprind data que cria todo SQL automático e devolve a lista pronta.

    }

    public Personagem inserir(Personagem personagem) {
        personagem = repository.save(personagem);
        return personagem;

        // Recebemos um personagem sem ID, pedimos para salvar no repositorio e quando
        // retornar o personagem
        // será atibuido o ID automático. Então retorna o personagem.
    }

    public Personagem consultarPorId(Integer id) {
        // Optional<Personagem> personagemOpt = repository.findById(id);
        // if (personagemOpt.isEmpty()) {
        // throw new IllegalArgumentException("Personagem não encontrado com o id " +
        // id);
        // }
        // Personagem personagem = personagemOpt.get();
        // return personagem;

        return repository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Personagem não encontrado com o id " + id));
    }

}
