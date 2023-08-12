package com.oliveraluis.architecturehexagonalstarter.todos.infrastructure.outbound.external;

import com.oliveraluis.architecturehexagonalstarter.todos.domain.model.TodoCommand;
import com.oliveraluis.architecturehexagonalstarter.todos.domain.model.TodoQuery;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@FeignClient(name = "${json-placeholder.client.name}-todos", url = "${json-placeholder.url}/todos")
public interface JsonPlaceholderTodoAPIClient {
    @PostMapping
    TodoQuery create(@RequestBody TodoCommand request);

    @GetMapping("/{id}")
    TodoQuery findPostById(@PathVariable Integer id);

    @GetMapping
    List<TodoQuery> getAllPosts();

    @GetMapping
    List<TodoQuery> searchByParam(@RequestParam Map<String, String> params);
}
