package com.oliveraluis.architecturehexagonalstarter.todos.infrastructure.inbound.controllers;

import com.oliveraluis.architecturehexagonalstarter.todos.application.find.TodoFindUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserTodoController {
    private final TodoFindUseCase todoFindUseCase;
    @GetMapping("/{id}/todos")
    public ResponseEntity findAllPosts(@PathVariable Integer id){
        return ResponseEntity.ok(this.todoFindUseCase.findAllTodosByUserId(id));
    }
}
