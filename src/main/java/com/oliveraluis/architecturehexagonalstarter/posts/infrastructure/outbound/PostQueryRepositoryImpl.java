package com.oliveraluis.architecturehexagonalstarter.posts.infrastructure.outbound;

import com.oliveraluis.architecturehexagonalstarter.posts.domain.model.PostQuery;
import com.oliveraluis.architecturehexagonalstarter.posts.domain.repository.PostQueryRepository;
import com.oliveraluis.architecturehexagonalstarter.posts.infrastructure.outbound.external.JsonPlaceholderPostAPIClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class PostQueryRepositoryImpl implements PostQueryRepository {
    private final JsonPlaceholderPostAPIClient jsonPlaceholderPostAPIClient;
    @Override
    public Optional<PostQuery> findById(int id) {
        return Optional.ofNullable(jsonPlaceholderPostAPIClient.findPostById(id));
    }

    @Override
    public List<PostQuery> searchBy(Map<String, String> params) {
        return jsonPlaceholderPostAPIClient.searchByParam(params);
    }

    @Override
    public List<PostQuery> findAllPosts() {
        return jsonPlaceholderPostAPIClient.getAllPosts();
    }
}
