package com.oliveraluis.architecturehexagonalstarter.todos.infrastructure.outbound;

import com.oliveraluis.architecturehexagonalstarter.todos.infrastructure.outbound.external.JsonPlaceholderTodoAPIClient;
import com.oliveraluis.architecturehexagonalstarter.todos.domain.model.TodoCommand;
import com.oliveraluis.architecturehexagonalstarter.todos.domain.model.TodoQuery;
import com.oliveraluis.architecturehexagonalstarter.todos.domain.repository.TodoCommandRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class TodoCommandRepositoryImpl implements TodoCommandRepository {
    private final JsonPlaceholderTodoAPIClient jsonPlaceholderTodoAPIClient;

    @Override
    public Optional<TodoQuery> createTodo(TodoCommand todoCommand) {
        return Optional.ofNullable(jsonPlaceholderTodoAPIClient.create(todoCommand));
    }

    @Override
    public Optional<TodoQuery> updateTodo(TodoCommand todoCommand) {
        return Optional.empty();
    }

    @Override
    public void deletePost(int id) {
    }
}
