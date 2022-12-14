package prova.restapi.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import prova.restapi.models.Cerveja;
import prova.restapi.repository.CervejaRepository;

@RestController
public class CervejaController {

    @Autowired
    private CervejaRepository repository;


    @GetMapping(path = "/api/Cerveja/{nome}")
    public ResponseEntity consultar(@PathVariable("nome") Integer nome){

        return repository.findById(nome)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }
    @PostMapping(path = "api/Cerveja/salvar")
    public Cerveja salvar(@RequestBody Cerveja nome) {
        return repository.save(nome);


    }

}
