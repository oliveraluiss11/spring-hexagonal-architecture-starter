package com.oliveraluis.architecturehexagonalstarter.todos.infrastructure.outbound;

import com.oliveraluis.architecturehexagonalstarter.todos.infrastructure.outbound.external.JsonPlaceholderTodoAPIClient;
import com.oliveraluis.architecturehexagonalstarter.todos.domain.model.TodoQuery;
import com.oliveraluis.architecturehexagonalstarter.todos.domain.repository.TodoQueryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class TodoQueryRepositoryImpl implements TodoQueryRepository {
    private final JsonPlaceholderTodoAPIClient jsonPlaceholderTodoAPIClient;
    @Override
    public Optional<TodoQuery> findById(int id) {
        return Optional.ofNullable(jsonPlaceholderTodoAPIClient.findPostById(id));
    }

    @Override
    public List<TodoQuery> searchBy(Map<String, String> params) {
        return jsonPlaceholderTodoAPIClient.searchByParam(params);
    }

    @Override
    public List<TodoQuery> findAllTodos() {
        return jsonPlaceholderTodoAPIClient.getAllPosts();
    }
}
