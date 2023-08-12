package com.oliveraluis.architecturehexagonalstarter.posts.infrastructure.inbound.controllers;

import com.oliveraluis.architecturehexagonalstarter.posts.application.find.PostFindUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserPostController {
    private final PostFindUseCase postFindUseCase;
    @GetMapping("/{id}/posts")
    public ResponseEntity findAllPosts(@PathVariable Integer id){
        return ResponseEntity.ok(this.postFindUseCase.findAllPostsByUserId(id));
    }
}
