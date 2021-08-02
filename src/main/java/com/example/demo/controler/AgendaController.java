package com.example.demo.controler;

import com.example.demo.model.Contato;
import com.example.demo.service.ContatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Seguindo o padrão de APIs essa será a classe que é o ponto dde entrada da API.
 * O Spring Boot possui a annotation @RestController onde ele vai saber que essa classe fará a comunicação HTTP e vai criar os
 * endpoints, por padrão o formato aceito é JSON mas caso precise é fácil de configurar para outros formatos como XML ou FORM
 */
@RestController
/**
 * A annotation @RequestMapping é usada para mapear pro Spring Boot qual será a rota dessa classe:
 * http://localhost:8080/agenda
 */
@RequestMapping("agenda")
public class AgendaController {

    private ContatoService service;

    @Autowired
    public AgendaController(ContatoService service) {
        this.service = service;
    }

    /**
     * A annotation @PostMapping funciona pro Spring Boot saber qual método HTTP esse método deve responder, nesse caso um
     * POST e deve passar um JSON no formato de Contato. O verbo POST é usado quando queremos inserir dados novos.
     */
    @PostMapping
    public Contato savaContato(@RequestBody Contato contato){
        return service.salvaContato(contato);
    }

    /**
     * A annotation @GetMapping é usada quando queremos buscar dados. Geralmente usamos com algum valor que será usado para
     * fazer a busca e nesse caso usamos o id para fazer a busca e é preciso mapear isso com a annotation @RequestParam.
     * @param id
     * @return
     */
    @GetMapping
    public Contato buscaContato(@RequestParam("id") Integer id){
        return service.buscaContatoPorId(id);
    }
}
