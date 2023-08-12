package com.oliveraluis.architecturehexagonalstarter.todos.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class TodoQuery {
    private Long userId;
    private Long id;
    private String title;
    private Boolean completed;
}
