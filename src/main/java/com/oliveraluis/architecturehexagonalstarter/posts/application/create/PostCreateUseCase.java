package com.oliveraluis.architecturehexagonalstarter.posts.application.create;

import com.oliveraluis.architecturehexagonalstarter.posts.domain.repository.PostCommandRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostCreateUseCase {
    private final PostCommandRepository postCommandRepository;

}
