// Semana 06 - API Reativa, aula Controlador
package br.edu.utfpr.todo;

import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class TodoRestController {

    private final TodoRepository repository;

    public TodoRestController(final TodoRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/todos")
    public Flux<Todo> lerTodos() {
        return repository.findAll();
    }

    @GetMapping("/todos/{feito}")
    public Flux<Todo> lerByFeito(@PathVariable boolean feito) {
        return repository.findByFeito(feito);
    }

    @PostMapping("/todos")
    public Mono<Todo> criar(@RequestBody Todo todo) {
        return repository.save(todo);
    }

    @DeleteMapping("/todos/{id}")
    public Mono<Void> deletar(@PathVariable String id) {
        return repository.deleteById(id);
    }

    @PutMapping("/todos/{id}")
    public Mono<Todo> atualizar(@PathVariable String id) {
        return repository
                .findById(id)
                .map(todoAtual -> new Todo(id,
                                           todoAtual.titulo(),
                                           todoAtual.descricao(),
                                           todoAtual.feito()))
                .flatMap(repository::save)
                .onTerminateDetach();
    }
}
