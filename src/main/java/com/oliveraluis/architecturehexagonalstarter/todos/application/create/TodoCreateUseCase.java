package com.oliveraluis.architecturehexagonalstarter.todos.application.create;

import com.oliveraluis.architecturehexagonalstarter.posts.domain.repository.PostCommandRepository;
import com.oliveraluis.architecturehexagonalstarter.todos.domain.repository.TodoCommandRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TodoCreateUseCase {
    private final TodoCommandRepository todoCommandRepository;

}
