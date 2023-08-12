package com.oliveraluis.architecturehexagonalstarter.todos.domain.repository;

import com.oliveraluis.architecturehexagonalstarter.todos.domain.model.TodoQuery;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface TodoQueryRepository {
    Optional<TodoQuery> findById(int id);

    List<TodoQuery> searchBy(Map<String, String> params);

    List<TodoQuery> findAllTodos();
}
