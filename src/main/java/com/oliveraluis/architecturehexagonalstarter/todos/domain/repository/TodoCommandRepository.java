package com.oliveraluis.architecturehexagonalstarter.todos.domain.repository;

import com.oliveraluis.architecturehexagonalstarter.todos.domain.model.TodoCommand;
import com.oliveraluis.architecturehexagonalstarter.todos.domain.model.TodoQuery;

import java.util.Optional;

public interface TodoCommandRepository {
    Optional<TodoQuery> createTodo(TodoCommand todoCommand);
    Optional<TodoQuery> updateTodo(TodoCommand todoCommand);
    void deletePost(int id);
}
