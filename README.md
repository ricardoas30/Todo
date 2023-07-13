
# API Reativa com Spring WebFlux

Projeto API back-end utilizando o Spring Boot e Web Flux. O Spring WebFlux é um projeto que permite criar aplicações reativas. Isso significa que a requisição
do cliente não fica bloqueada enquanto os processos internos são executados pelo
aplicativo no sistema operacional.




## Documentação da API

#### Retorna todas as tarefas

```http
  GET /todos
```

#### Retorna as tarefas realizadas

```http
  GET /todos/${feito}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `feito`      | `boolean` | **Obrigatório**. Flag que identifica uma tarefa realizada |

#### Adicionar uma tarefa

```http
  POST /todos
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `string` | **Obrigatório**. ID da tarefa |
| `titulo`      | `string` | **Obrigatório**. Título da tarefa |
| `descricao`      | `string` | **Obrigatório**. Descrição de uma tarefa |
| `feito`      | `boolean` | **Obrigatório**. Flag que identifica uma tarefa realizada |


#### Alterar uma tarefa

```http
  PUT /todos/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `string` | **Obrigatório**. ID da tarefa |
| `titulo`      | `string` | **Obrigatório**. Título da tarefa |
| `descricao`      | `string` | **Obrigatório**. Descrição de uma tarefa |
| `feito`      | `boolean` | **Obrigatório**. Flag que identifica uma tarefa realizada |

#### Deletar uma tarefa

```http
  DELETE /todos/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `string` | **Obrigatório**. O ID da tarefa |

## Stack utilizada

**Back-end:** JDK 17, Spring Boot 2.7.13, MongoDB Reactive, Webflux


