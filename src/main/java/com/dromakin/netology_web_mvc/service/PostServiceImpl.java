package com.dromakin.netology_web_mvc.service;


import com.dromakin.netology_web_mvc.model.Post;
import com.dromakin.netology_web_mvc.repository.PostRepository;
import com.dromakin.netology_web_mvc.exception.NotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;

@AllArgsConstructor
@Service
public class PostServiceImpl implements PostService {
    private final PostRepository repository;

    public List<Post> all(boolean active) {
        return repository.all(active);
    }

    public Post getById(long id) {
        return repository.getById(id).orElseThrow(NotFoundException::new);
    }

    public Post save(Post post) {
        return repository.saveUpdate(post);
    }

    public void removeById(long id) {
        repository.removeById(id);
    }
}

