
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

## Screenshots

Listando todas as tarefas
![App Screenshot](https://user-images.githubusercontent.com/14126452/253426344-38a4c4ed-4423-4cd5-b3e3-e679de7fef1f.png)

Retornando as tarefas não realizadas
![App Screenshot](https://user-images.githubusercontent.com/14126452/253426343-638445e5-2a6b-43ea-88af-4891f40331be.png)

Criando uma nova tarefa
![App Screenshot](https://user-images.githubusercontent.com/14126452/253426347-5a945cf3-e2a1-4553-8880-8e949a03ff1d.png)

Deletando uma tarefa
![App Screenshot](https://user-images.githubusercontent.com/14126452/253426336-b4824593-018f-4e68-a15d-cfdd36f93ce8.png)


