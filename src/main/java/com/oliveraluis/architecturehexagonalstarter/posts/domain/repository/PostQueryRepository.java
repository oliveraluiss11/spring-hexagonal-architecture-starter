package com.oliveraluis.architecturehexagonalstarter.posts.domain.repository;

import com.oliveraluis.architecturehexagonalstarter.posts.domain.model.PostQuery;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface PostQueryRepository {
    Optional<PostQuery> findById(int id);

    List<PostQuery> searchBy(Map<String, String> params);

    List<PostQuery> findAllPosts();
}
