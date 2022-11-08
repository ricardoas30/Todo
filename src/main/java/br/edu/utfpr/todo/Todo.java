// Semana 06 - API Reativa, aula Entidade
package br.edu.utfpr.todo;

public record Todo(String id, String titulo, String descricao, boolean feito) {

    public Todo {
        if(titulo == null || titulo.length() < 3) {
            throw new IllegalArgumentException("Um título maior que 3 caracteres é necessário.");
        }
    }
}
