package com.senai.perssonagem.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity; // Biblioteca do SpringData
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // Mapear a entidade JPA - Faz o mapeamento de objetos relacional que pega um
        // objeto e mapea com uma tabela no mundo relacional. É fazer com que a Classe
        // Personagem interaja com o banco de dados.
@Table(name = "personagens") // Entidade Table faz com que seja mapeada e criada a tabela de forma automática
                             // no banco de dados e por convenção precisam ser no plural.
public class Personagem {

    @Id // Toda entidade JPA precisa ter um Identificador do personagem interno da
        // aplicação como se fosse a chave primária, mas não podemos dizer que é porque
        // chave primária é um conceito de objeto relacional de tabela e exije que tenha
        // um @Id.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Gerador de identificador JPA que atribui ao banco de dados a
                                                        // criação e gerenciamento com estratégia sequencial.
    private Integer id;

    @Column(length = 100, nullable = false) // Dizer ao banco de dados que nome não seja Nulo e que o tamanho do varchar
                                            // seje até 100 caracteres.
    private String nome;

    @Enumerated(EnumType.STRING) // Faz com que a Enum seja guardada pelo nome da Enum. Caso não seja
                                 // colocada esta anotação e Enum será no padrão ordinal.
    @Column(nullable = false)
    private Tipo tipo; // Tipo é uma Enum onde é criado uma lista como por exemplo: Menu.

    @Column(length = 40, nullable = false)
    private String referencia;

    @Column(nullable = false)
    private LocalDate dataCadastro;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

}
