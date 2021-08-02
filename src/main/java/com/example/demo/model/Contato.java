package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Essa classe representa o modelo dde dados que será trafegado pela API, apesar dessa classe ser bem simples é bem
 * importante ter essa ideia bem definida para que uma API ou aplicação não comece pequena e cresça descontroladamente.
 * Aqui usamos Lombok que reduz bastante a verbosidade a anotação @Data implementa os getters e setters jutamente com o
 * método toString, equals e hashCode o que é muito importante quando se trabalha com listas e coleções de dados.
 * Aproveitamos e adicionamos a annoatations do JPA, que é o módulo de persistência de dados que o Java possui, com isso
 * conseguimos nos comunicar com os bancos de dados dde forma mais simples.
 */
@Data
/**
 * A annotation @Entity é usada para identificar que essa classe representa uma tabela no banco de dados
 */
@Entity(name = "Contato")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Contato {

    /**
     * A annotation @Id marca o campo para ele ser o identificador unico no banco de dados
     */
    @Id
    /**
     * E a annotation @GeneratedValue define qual será a estratégia que será adotada, nesse exemplo é Identity
     * que significa que ele vai começar do 1 e a cada registro novo vai acrescentar de 1 em 1.
     */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * A annotation @Column é para mapear que esses atributos serão convertidos em colunas no banco de dados.
     */
    @Column
    private String name;

    @Column
    private String telephone;

}
