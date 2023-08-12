package com.oliveraluis.architecturehexagonalstarter.todos.infrastructure.inbound.controllers;

import com.oliveraluis.architecturehexagonalstarter.todos.application.find.TodoFindUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/todos")
@RequiredArgsConstructor
public class TodoController {
    private final TodoFindUseCase todoFindUseCase;
    @GetMapping
    public ResponseEntity findAllTodos(){
        return ResponseEntity.ok(this.todoFindUseCase.findAllTodos());
    }
}
