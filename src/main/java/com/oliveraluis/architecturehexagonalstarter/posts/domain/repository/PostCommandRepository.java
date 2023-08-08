package com.oliveraluis.architecturehexagonalstarter.posts.domain.repository;

import com.oliveraluis.architecturehexagonalstarter.posts.domain.model.PostCommand;
import com.oliveraluis.architecturehexagonalstarter.posts.domain.model.PostQuery;

import java.util.Optional;

public interface PostCommandRepository {
    Optional<PostQuery> createPost(PostCommand postCommand);
    Optional<PostQuery> updatePost(PostCommand postCommand);
    void deletePost(int id);
}
