package prova.restapi.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {
    @GetMapping(path = "/api/status")
    public String check() {
        return "public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {\n" +
                "}\n";
    }

}
