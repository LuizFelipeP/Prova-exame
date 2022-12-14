package prova.restapi.repository;

import org.springframework.data.repository.CrudRepository;
import prova.restapi.models.Cerveja;

public interface CervejaRepository extends CrudRepository<Cerveja, Integer> {
}

