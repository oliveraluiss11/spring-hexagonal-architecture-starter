package com.oliveraluis.architecturehexagonalstarter.posts.infrastructure.outbound.external;

import com.oliveraluis.architecturehexagonalstarter.posts.domain.model.PostCommand;
import com.oliveraluis.architecturehexagonalstarter.posts.domain.model.PostQuery;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@FeignClient(name = "${json-placeholder.client.name}-posts", url = "${json-placeholder.url}/posts")
public interface JsonPlaceholderPostAPIClient {
    @PostMapping
    PostQuery create(@RequestBody PostCommand request);

    @GetMapping("/{id}")
    PostQuery findPostById(@PathVariable Integer id);

    @GetMapping
    List<PostQuery> getAllPosts();

    @GetMapping
    List<PostQuery> searchByParam(@RequestParam Map<String, String> params);
}
