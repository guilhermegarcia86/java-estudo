package com.example.demo.service;

import com.example.demo.model.Contato;
import com.example.demo.repository.AgendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Essa classe contém as regras de negócio que essa aplicação deve ter, é aqui que deve ficar concentrado o O Que a aplicação
 * deve fazer.
 * Pra ficar mais claro isso usamos a annotation @Service que faz com que essa classe seja administrada pelo Spring Boot
 * para injeção de dependência e também deixa mais semântico a ideia de que o serviço dessa aplicação está concentrado aqui.
 */
@Service
public class ContatoService {

    private AgendaRepository repository;

    /**
     * Como precisamos da Repository para buscar e salvar dados podemos injetar ela através do construtor onde o Spring Boot
     * fica responsável por deixar a Repository com uma instância e não vamos tomar erros do tipo NullPointer.
     * A annotation @Autowired é a responsável por injetar todas as dependências que anotamos com @Service, @Repository,
     * @Component ou @Bean.
     */
    @Autowired
    public ContatoService(AgendaRepository repository){
        this.repository = repository;
    }

    public Contato salvaContato(Contato contato){
        System.out.println("Preparando para salvar contato: " + contato.toString());
        final Contato contato1 = repository.save(contato);
        return contato1;
    }

    public Contato buscaContatoPorId(Integer id){
        System.out.println("Buscando contato");
        final Optional<Contato> optionalContato = repository.findById(id);
        if(optionalContato.isEmpty()){
            return null;
        }

        return optionalContato.get();
    }
}
