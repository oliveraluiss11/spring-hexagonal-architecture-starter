package com.oliveraluis.architecturehexagonalstarter.todos.domain.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class TodoCommand {
    private Long userId;
    private Boolean completed;
    private String title;
}
