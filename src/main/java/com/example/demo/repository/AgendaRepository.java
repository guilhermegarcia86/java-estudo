package com.example.demo.repository;

import com.example.demo.model.Contato;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Padrão Repository é usado para acessar informações em uma fonte de dados, geralmente são bancos de dados,
 * mas pode ser qualquer coisa que seja uma fonte de dados, bancos dde dados, planilha Excel, outras APIs e etc.
 * O Spring possui uma annotation específica para isso que é a @Repository com isso já indicamos que essa interface será
 * responsável por administrar essa fonte de dados.
 * Essa interface também estende da interfacce CrudRepository que já nos dá de presente os métodos para acessar esses dados
 * sem com a gente se preocupe muito com a implementação disso. É necessário passar para a CrudRepository o tipo que nesse
 * caso é Contato e o tipo do identificador único (id) que nesse caso é um Integger.
 */
@Repository
public interface AgendaRepository extends CrudRepository<Contato, Integer> {
}
