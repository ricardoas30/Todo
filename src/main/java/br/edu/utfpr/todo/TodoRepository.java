// Semana 06 - API Reativa, aula Persistência
package br.edu.utfpr.todo;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface TodoRepository extends ReactiveMongoRepository<Todo, String> {

    Flux<Todo> findByFeito(boolean feito);

}
