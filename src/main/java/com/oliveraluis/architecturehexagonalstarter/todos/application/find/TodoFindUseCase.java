package com.oliveraluis.architecturehexagonalstarter.todos.application.find;

import com.oliveraluis.architecturehexagonalstarter.posts.domain.model.PostQuery;
import com.oliveraluis.architecturehexagonalstarter.posts.domain.repository.PostQueryRepository;
import com.oliveraluis.architecturehexagonalstarter.todos.domain.model.TodoQuery;
import com.oliveraluis.architecturehexagonalstarter.todos.domain.repository.TodoQueryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class TodoFindUseCase {
    private final TodoQueryRepository todoQueryRepository;
    public List<TodoQuery> findAllTodos(){
        return this.todoQueryRepository.findAllTodos();
    }
    public TodoQuery findById(Integer id){
        return this.todoQueryRepository.findById(id).orElseThrow();
    }
    public List<TodoQuery> findAllTodosByUserId(Integer userId){
        return this.todoQueryRepository.searchBy(Map.of("userId",String.valueOf(userId)));
    }
}
