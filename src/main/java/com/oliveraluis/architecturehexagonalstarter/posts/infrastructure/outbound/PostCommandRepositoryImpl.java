package com.oliveraluis.architecturehexagonalstarter.posts.infrastructure.outbound;

import com.oliveraluis.architecturehexagonalstarter.posts.domain.model.PostCommand;
import com.oliveraluis.architecturehexagonalstarter.posts.domain.model.PostQuery;
import com.oliveraluis.architecturehexagonalstarter.posts.domain.repository.PostCommandRepository;
import com.oliveraluis.architecturehexagonalstarter.posts.infrastructure.outbound.external.JsonPlaceholderAPIClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class PostCommandRepositoryImpl implements PostCommandRepository {
    private final JsonPlaceholderAPIClient jsonPlaceholderAPIClient;

    @Override
    public Optional<PostQuery> createPost(PostCommand postCommand) {
        return Optional.ofNullable(jsonPlaceholderAPIClient.create(postCommand));
    }

    @Override
    public Optional<PostQuery> updatePost(PostCommand postCommand) {
        return Optional.empty();
    }

    @Override
    public void deletePost(int id) {
    }
}
