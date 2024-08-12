package com.dromakin.netology_web_mvc.controller;

import com.dromakin.netology_web_mvc.dto.PostDto;
import com.dromakin.netology_web_mvc.model.Post;
import com.dromakin.netology_web_mvc.repository.PostRepositoryImpl;
import com.dromakin.netology_web_mvc.service.PostService;
import com.dromakin.netology_web_mvc.service.utils.MappingUtils;
import lombok.AllArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@RestController
@RequestMapping("/api/posts")
public class PostController {
    private static final Logger logger = LogManager.getLogger(PostController.class);

    private final PostService service;
    private final MappingUtils mappingUtils;

    @GetMapping("/all")
    public List<PostDto> all(
            @RequestParam boolean active
    ) {
        return service.all(active).stream().map(mappingUtils::postToPostDto).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public PostDto getById(
            @PathVariable long id
    ) {
        return mappingUtils.postToPostDto(service.getById(id));
    }

    @PostMapping
    public PostDto save(
            @RequestBody Post post
    ) {
        return mappingUtils.postToPostDto(service.save(post));
    }

    @DeleteMapping("/{id}")
    public void removeById(
            @PathVariable long id
    ) {
        service.removeById(id);
    }
}
